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

    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save ...");
    }

    public void update(){
        System.out.println("book dao update ...");
    }
}