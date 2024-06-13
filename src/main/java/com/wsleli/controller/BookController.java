package com.wsleli.controller;

import com.wsleli.domain.Book;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/06/13 18:22
 */
public class BookController {
    @RequestMapping(value = "/books", method = RequestMethod.POST)
    @ResponseBody
    public String save(@RequestBody Book book) {
        System.out.println("book save..." + book);
        return "{'module':'book save'}";
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id) {
        System.out.println("book delete..." + id);
        return "{'module':'book delete'}";
    }

    @RequestMapping(value = "/books", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody Book book) {
        System.out.println("book update..." + book);
        return "{'module':'book update'}";
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id) {
        System.out.println("book getById..." + id);
        return "{'module':'book getById'}";
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    @ResponseBody
    public String getAll() {
        System.out.println("book getAll...");
        return "{'module':'book getAll'}";
    }
}
