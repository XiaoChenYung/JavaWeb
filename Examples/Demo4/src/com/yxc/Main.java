package com.yxc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tm on 16/9/2.
 */
@Controller
public class Main {
    @RequestMapping(value = "/index2",method = RequestMethod.GET)
    public String index() {
        return "index2";
    }
}
