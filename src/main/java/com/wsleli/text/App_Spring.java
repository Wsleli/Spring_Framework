package com.wsleli.text;

import com.wsleli.config.SpringConfig;
import com.wsleli.dao.BookDao;
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

        BookDao bookDao = ctx.getBean(BookDao.class);

        bookDao.delete();
    }
}
