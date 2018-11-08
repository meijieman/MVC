package com.major.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello(Model model){
        log.info("调用 hello");

        model.addAttribute("url", "https://github.com");
        model.addAttribute("name", "GitHub");

//        return "WEB-INF/jsp/hello.jsp";
        return "hello";
    }
}
