package com.lindj.controller;

import com.lindj.service.InvestedTemplateTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("${url.length}")
    private Integer port;
    @Autowired
    private InvestedTemplateTaskService templateTaskService;


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Object getAll(){
        return this.templateTaskService.selectAll();
    }

    @RequestMapping(value = "/getUrlLength", method = RequestMethod.GET)
    public Object getPort(){
        return this.port;
    }
}
