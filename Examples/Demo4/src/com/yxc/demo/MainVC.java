package com.yxc.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by tm on 16/8/25.
 */
@Controller
public class MainVC {
    @RequestMapping(value = "/123", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
