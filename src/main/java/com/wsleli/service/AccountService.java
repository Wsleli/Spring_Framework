package com.wsleli.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/09 11:29
 */
public interface AccountService {
    /**
     * 转账操作
     *
     * @param out   传出方
     * @param in    转入方
     * @param money 金额
     */
    @Transactional
    public void transfer(String out, String in, Double money);
}
