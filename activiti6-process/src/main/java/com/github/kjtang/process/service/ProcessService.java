package com.github.kjtang.process.service;

import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipInputStream;

/**
 * Created by kjtang on 2018/6/26.
 * 流程接口
 */
public interface ProcessService {

    /**
     * 部署流程
     * @param bpmnName 流程bpmn2.0文件名
     * @param inputStreamBPMN 流程bpmn2.0输入流
     * @param pngName  流程png文件名
     * @param inputStreamPNG 流程png输入流
     */
     void deploymentProcess(String bpmnName, InputStream inputStreamBPMN, String pngName, InputStream inputStreamPNG);

    /**
     * 部署流程
     * @param zipName 流程压缩文件名
     * @param zipInputStream 流程压缩文件输入流
     */
     void deploymentProcess(String zipName, ZipInputStream zipInputStream);

    /**
     *
     * @return
     */
    List<Object> listPageDeploymentProcess();

}