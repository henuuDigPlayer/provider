package com.lindj.controller;

import com.lindj.config.ConfigParams;
import com.lindj.service.InvestedTemplateTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lindongjie on 18/1/4.
 */
@RestController
@RequestMapping("/task")
@RefreshScope
public class InvestedTemplateTaskController {

    @Autowired
    private ConfigParams configParams;

    @Autowired
    private InvestedTemplateTaskService templateTaskService;


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Object getAll(){
        return this.templateTaskService.selectAll();
    }

    @RequestMapping(value = "/getLength", method = RequestMethod.GET)
    public Object getLength(){
        return this.configParams.getLength();
    }
}
