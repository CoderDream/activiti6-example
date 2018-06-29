package com.github.kjtang.process.service.impl;

import com.github.kjtang.process.service.ProcessService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipInputStream;

/**
 * Created by kjtang on 2018/6/26.
 */
@Service
public class ProcessServiceImpl implements ProcessService{

    public static Logger LOGGER = LoggerFactory.getLogger(ProcessServiceImpl.class);

    @Autowired
    private RepositoryService repositoryService;

    @Override
    public void deploymentProcess(String bpmnName,InputStream inputStreamBPMN,String pngName,InputStream inputStreamPNG) {
        Deployment deployment =repositoryService.createDeployment()
                                                .addInputStream(bpmnName,inputStreamBPMN)
                                                .addInputStream(pngName,inputStreamPNG)
                                                .deploy();
        LOGGER.trace("流程发布成功，流程发布id:{1},流程发布时间{2}",deployment.getId(),deployment.getDeploymentTime());
    }

    @Override
    public void deploymentProcess(String zipName, ZipInputStream zipInputStream) {
        Deployment deployment  = repositoryService.createDeployment()
                                                  .addZipInputStream(zipInputStream)
                                                  .deploy();
        LOGGER.trace("流程部署成功，部署id:{}",deployment.getId());
    }

    @Override
    public List<Object> listPageDeploymentProcess() {
        DeploymentQuery deploymentQuery = repositoryService.createDeploymentQuery();
        deploymentQuery.listPage(1,10);
        return null;
    }

}