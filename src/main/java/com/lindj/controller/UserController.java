package com.lindj.controller;

import com.lindj.model.InvestedTemplateTask;
import com.lindj.service.RabbitProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lindongjie on 17/12/1.
 */

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private RabbitProviderService rabbitProviderService;


    @RequestMapping(value = "/say",method= RequestMethod.GET)
    public String sayHello(){
        return "hello world !";
    }

    @RequestMapping(value = "/send",method= RequestMethod.GET)
    public Object sendMessage(){
        String content = "hello world !";
        this.rabbitProviderService.sendMessage(content);

        return content;
    }

    @RequestMapping(value = "/sends",method= RequestMethod.GET)
    public Object sendMessages(){

        InvestedTemplateTask investedTemplateTask = new InvestedTemplateTask();
        investedTemplateTask.setClassName("task2");
        this.rabbitProviderService.sendMessages(investedTemplateTask);
        investedTemplateTask.setClassName("task");
        this.rabbitProviderService.sendMessage(investedTemplateTask);

        return investedTemplateTask;
    }

}
