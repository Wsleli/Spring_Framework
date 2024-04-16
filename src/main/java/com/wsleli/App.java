package com.wsleli;

import com.wsleli.config.SpringConfig;
import com.wsleli.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/15 15:01
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx.getBean(UserController.class));
    }
}
