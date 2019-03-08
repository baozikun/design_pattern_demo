package com.bz.mapper;
import com.bz.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface AccountMapper {

    int exists(@Param("cardNo") String cardNo);

    Account queryByCardNo(@Param("cardNo") String cardNo, @Param("password") String password);

    double queryBalance(@Param("cardNo") String cardNo);

    int freeze(@Param("cardNo") String cardNo);

    int balanceEnough(@Param("cardNo") String cardNo, @Param("transactionAmount") Double transactionAmount);

    void plusMoney(@Param("cardNo") String cardNo, @Param("transactionAmount") Double transactionAmount);

    void minsMoney(@Param("cardNo") String cardNo, @Param("transactionAmount") Double transactionAmount);
}
