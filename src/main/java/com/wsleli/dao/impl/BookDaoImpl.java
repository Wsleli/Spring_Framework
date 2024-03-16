package com.wsleli.dao.impl;

import com.wsleli.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @Author: Wsleli Wiliams
 * @Description: 功能描述
 * @Date: 2024/03/12 10:15
 */
@Repository
public class BookDaoImpl implements BookDao {

    public void update() {
        System.out.println("book dao update is running...");
    }

    public int select() {
        System.out.println("book dao select is running...");
//        int i = 1 / 0;
        return 100;
    }
}