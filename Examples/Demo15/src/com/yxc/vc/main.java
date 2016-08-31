package com.yxc.vc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by tm on 16/8/29.
 */
public class main {
    public main() {
        System.out.println("=====================初始化============");
    }

    @RequestMapping(value = "/index")
    public String indexJSP() {
        return "/index";
    }
}
