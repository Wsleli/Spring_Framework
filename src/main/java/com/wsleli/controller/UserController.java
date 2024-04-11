package com.wsleli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/11 10:31
 */
@Controller
public class UserController {
    // 设置当前操作访问路径
    @RequestMapping("/save")
    // 设置当前操作返回值类型
    @ResponseBody
    public String save() {
        System.out.println("user save ...");
        return "{'module':'springmvc'}";
    }
}
