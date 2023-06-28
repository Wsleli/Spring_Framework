package com.wsleli.text;

import com.wsleli.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.save();
    }
}
