package com.vonzhou.learningspring.controller;

import com.vonzhou.learningspring.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by vonzhou on 16/4/19.
 */

@Controller
public class HomeController {

    public static final int DEFAULT_SPITTLES_PER_PAGE = 1;  // 自己设置,方便测试

    private SpitterService spitterService;

    @Autowired
    public HomeController(SpitterService spitterService){
        this.spitterService = spitterService;
    }



    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }

    @RequestMapping({"/", "/home"})
    public String showHomePage(Map<String, Object> model){
        // get from database TODO
        return "home";
    }

}
