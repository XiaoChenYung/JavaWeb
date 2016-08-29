package com.yxc.vc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by yangxiaochen on 16/8/28.
 */
@Controller
public class Main {
    public Main() {
        System.out.println("=====================初始化============");
    }

    @RequestMapping(value = "index")
    public String indexJSP() {
        return "/index";
    }
}
