package com.gaussic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dzkan on 2016/3/8.
 */
@Controller
public class MainController {

    @RequestMapping(value = "index.html", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}