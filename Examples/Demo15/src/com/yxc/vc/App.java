package com.yxc.vc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by tm on 16/8/31.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"); main obj = (main) context.getBean("helloBean");
        obj.printHello();
    }
}
