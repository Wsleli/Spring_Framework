package com.wsleli.dao;

import com.wsleli.domain.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/15 14:46
 */
public interface UserDao {
    @Insert("insert into tbl_user(name,age)values(#{name},#{age})")
    public void save(User user);
}
