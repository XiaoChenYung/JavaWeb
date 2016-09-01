package com.yxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tm on 16/8/31.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home() {
        return "test";
    }
}
