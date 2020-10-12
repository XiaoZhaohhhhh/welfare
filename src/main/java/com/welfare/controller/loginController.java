package com.welfare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class loginController {

    @RequestMapping("user/login")
    @ResponseBody
    public String login(){
        return "ok";
    }
}
