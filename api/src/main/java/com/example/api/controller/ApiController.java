package com.example.api.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
    private static final Log logger = LogFactory.getLog(ApiController.class);

    @RequestMapping("")
    @ResponseBody
    public void login(){

    }
}
