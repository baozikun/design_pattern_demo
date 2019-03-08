package com.bz.service.impl;

import com.bz.constant.StatusCodeConstants;
import com.bz.mapper.AccountMapper;
import com.bz.mapper.TransactionRecordMapper;
import com.bz.pojo.Account;
import com.bz.pojo.TransactionRecord;
import com.bz.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private TransactionRecordMapper transactionRecordMapper;
    @Override
    public boolean exists(String cardNo) {
        int count = accountMapper.exists(cardNo);
        return count == 1 ? true : false;
    }

    @Override
    public Account login(Account account) {
        Account a = accountMapper.queryByCardNo(account.getCardNo(),account.getPassword());
        return a;
    }

    @Override
    public double queryBalance(String cardNo) {
        return accountMapper.queryBalance(cardNo);
    }

    @Override
    public Map<String, Object> transfer(Account sourceAccount, String cardNo, Double transactionAmount) {
        Map<String, Object> map = new HashMap<>();
        int code = StatusCodeConstants.NOT_EXISTS;
        String msg = null;
        //1.检查账号是否存在
        int i = accountMapper.exists(cardNo);
        if(i == 1){
            code = StatusCodeConstants.EXISTS;
        //2.账号存在，检查是否被冻结
            i = accountMapper.freeze(cardNo);
            if (i==1) {
                //激活,检查余额
                i = accountMapper.balanceEnough(sourceAccount.getCardNo(),transactionAmount);
                if(i==1){
                    //4.转账
                       //目标账号加钱
                       accountMapper.plusMoney(cardNo,transactionAmount);
                       //源账号减钱
                       accountMapper.minsMoney(sourceAccount.getCardNo(),transactionAmount);
                       //产生交易记录
                       TransactionRecord transactionRecord = new TransactionRecord();
                       transactionRecord.setCardNo(sourceAccount.getCardNo());
                       transactionRecord.setTransactionAmount(transactionAmount);
                       transactionRecord.setTransactionType("转账");
                       transactionRecord.setTransactionDate(new Date());
                       //这里需要重新查询余额
                       transactionRecord.setBalance(accountMapper.queryBalance(sourceAccount.getCardNo()));
                       transactionRecordMapper.insert(transactionRecord);
                       code = StatusCodeConstants.SUCCESS;
                       msg = StatusCodeConstants.SUCCESS_MSG;
                }else{
                    code = StatusCodeConstants.BALANCE_NOT_ENOUGH;
                    msg = StatusCodeConstants.BALANCE_NOT_ENOUGH_MSG;
                }
            }else {
                //冻结
                code = StatusCodeConstants.FREEZE;
                msg = StatusCodeConstants.FREEZE_MSG;
            }
        }else {
            msg = StatusCodeConstants.NOT_EXISTS_MSG;
        }
        map.put("code",code);
        map.put("msg",msg);
        return map;
    }
}
