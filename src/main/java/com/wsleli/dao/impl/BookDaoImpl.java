package com.wsleli.dao.impl;

import com.wsleli.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/09 8:02
 */
@Repository
public class BookDaoImpl implements BookDao {
    public String findName(int id, String password) {
        System.out.println("id:" + id);
        if (true) throw new NullPointerException();
        return "itcast";
    }
}
