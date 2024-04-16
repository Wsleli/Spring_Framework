package com.wsleli.controller;

import com.wsleli.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/11 10:31
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String userName, int age) {
        System.out.println("普通参数传递 userName ==> " + userName);
        System.out.println("普通参数传递 age ==> " + age);
        return "{'module':'common param different name'}";
    }

    // POJO参数：请求参数与形参对象中的属性对应即可完成参数传递
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println("pojo参数传递 user ==> " + user);
        return "{'module':'pojo param'}";
    }

    // 嵌套P0J0参数
    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojocontainPojoParam(User user) {
        System.out.println("pojo嵌套pojo参数传递 user ==>" + user);
        return "{'module':'pojo contain pojo param'}";
    }

    // 数组参数
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes) {
        System.out.println("数组参数传 likes ==>" + Arrays.toString(likes));
        return "{'module':'array param'}";
    }

    // 集合参数
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes) {
        System.out.println("集合参数传递 likes ==>" + likes);
        return "{'module':'list param'}";
    }
}
