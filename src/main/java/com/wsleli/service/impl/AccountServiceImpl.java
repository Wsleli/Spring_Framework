package com.wsleli.service.impl;

import com.wsleli.dao.AccountDao;
import com.wsleli.service.AccountService;
import com.wsleli.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/09 11:29
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    public void transfer(String out, String in, Double money) {
        try {
            accountDao.outMoney(out, money);
            // int i = 1 / 0;
            accountDao.inMoney(in, money);
        } finally {
            logService.log(out, in, money);
        }
    }
}
