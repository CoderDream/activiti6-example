package com.github.kjtang.web.controller;

import com.github.kjtang.common.response.Response;
import com.github.kjtang.common.utils.VerifyCodeUtils;
import com.github.kjtang.core.entity.User;
import com.github.kjtang.core.service.UserService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by kjtang on 2018/6/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    public static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user, HttpSession session){
        User dbUser = userService.login(user);
        session.setAttribute("user",dbUser);
        return "index";
    }

    @GetMapping(value="/userListUI")
    public String userListUI(Model model) {
        return "user/userList";
    }

    @PostMapping(value = "userPageList")
    @ResponseBody
    public Response<PageInfo<User>> userPageList(User user){
        Response<PageInfo<User>> response = new Response<>();
        PageInfo<User> pageInfo = userService.getUserPageList(user);
        response.setData(pageInfo);
        return response;
    }

    @GetMapping(value = "/getVerifyCode")
    public void getVerifyCode(HttpServletResponse response, HttpServletRequest request) {
        try {
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("image/jpg");

            //生成随机字串
            String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
            LOGGER.info("verifyCode:{}",verifyCode);
            //存入会话session
            HttpSession session = request.getSession(true);
            session.setAttribute("_code", verifyCode.toLowerCase());
            //生成图片
            int w = 146, h = 33;
            VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
