package com.example.console.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
    private static final Log logger = LogFactory.getLog(loginController.class);
    @RequestMapping("/")
    public String login(){
        return "login";
    }
}
