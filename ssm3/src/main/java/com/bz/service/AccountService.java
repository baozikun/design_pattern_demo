package com.bz.service;

import com.bz.pojo.Account;

import java.math.BigDecimal;
import java.util.Map;

public interface AccountService {
    boolean exists(String cardNo);

    Account login(Account account);

    double queryBalance(String cardNo);


    Map<String, Object> transfer(Account sourceAccount, String cardNo, Double transactionAmount);
}
