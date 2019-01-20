package com.vonzhou.learningspring.controller;

import com.vonzhou.learningspring.domain.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;


/**
 * Created by vonzhou on 16/4/20.
 */
@Controller
@RequestMapping("/spitter")   // 根URL
public class SpitterController {

    private Logger logger = Logger.getLogger("SpitterController.class");

    @RequestMapping(value = "spittles", method = RequestMethod.GET)
    public String listSpittlesForSpitter(@RequestParam("spitter") String username, Model model) {
        return "spittles/list";
    }

    @RequestMapping(method = RequestMethod.GET, params = "new")
    public String createSpitterProfile(Model model) {
        model.addAttribute(new Spitter());
        return "spitters/edit";
    }

    @RequestMapping(value = "/json/test")
    public
    @ResponseBody
    Spitter getSpitterInJson() {
        Spitter spitter = new Spitter();
        spitter.setUsername("vonzhou");
        spitter.setId(100L);

        logger.info("++++++++++++++++++");
        return spitter;
    }
}
