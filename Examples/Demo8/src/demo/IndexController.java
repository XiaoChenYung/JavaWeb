package demo;

/**
 * Created by tm on 16/8/25.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cf
 * @description IntelliJ IDEA maven web springMVC测试
 * @create 2016-04-07 11:41
 **/

@Controller
public class IndexController {

    public IndexController() {
        System.out.println("=====================初始化============");
    }

    @RequestMapping(value = "/index")
    public String indexJSP() {
        return "/index";
    }
}
