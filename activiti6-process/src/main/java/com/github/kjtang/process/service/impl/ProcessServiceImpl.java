package com.github.kjtang.process.service.impl;

import com.github.kjtang.process.service.ProcessService;
import org.activiti.engine.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kjtang on 2018/6/26.
 */
public class ProcessServiceImpl implements ProcessService{

    @Autowired
    private RepositoryService repositoryService;

    @Override
    public void deploymentProcess() {

    }
}