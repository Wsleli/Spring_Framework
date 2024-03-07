package com.wsleli.text;

import com.wsleli.config.SpringConfig;
import com.wsleli.domin.Account;
import com.wsleli.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Wsleli Wiliams
 * @Description: 功能描述
 * @Date: 2024/03/07 15:55
 */
public class App_Spring {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);


        AccountService accountService = ctx.getBean(AccountService.class);

        Account ac = accountService.findById(2);
        System.out.println(ac);
    }
}
