package com.wsleli.service.impl;

import com.wsleli.dao.impl.BookDaoImpl;
import com.wsleli.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDaoImpl bookDao = new BookDaoImpl();

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
}
