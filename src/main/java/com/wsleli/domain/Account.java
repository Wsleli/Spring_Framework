package com.wsleli.domain;

import java.io.Serializable;

/**
 * @Author: Wsleli Wiliams
 * @Description: 功能描述
 * @Date: 2024/03/12 11:10
 */
public class Account implements Serializable {

    private Integer id;
    private String name;
    private Double money;
    // setter..getter..toString方法省略

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}