package com.lindj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lindongjie on 17/12/1.
 */

@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping(value = "/user/say",method= RequestMethod.GET)
    public String sayHello(){
        return "hello world !";
    }

    @RequestMapping(value = "/send",method= RequestMethod.GET)
    public String sendMessage(){

        return null;
    }
}
