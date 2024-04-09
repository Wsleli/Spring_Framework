package com.wsleli.dao.impl;

import com.wsleli.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/09 8:02
 */
@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    public boolean readResources(String url, String password) {
        System.out.println(password.length());
        // 模拟校验
        return password.equals("root");
    }
}