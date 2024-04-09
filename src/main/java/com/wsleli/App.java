package com.wsleli;

import com.wsleli.config.SpringConfig;
import com.wsleli.service.ResourcesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/09 8:05
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService = ctx.getBean(ResourcesService.class);
        boolean flag = resourcesService.openURL("http://pan.baidu.com/haha", "root ");
        System.out.println(flag);
    }
}