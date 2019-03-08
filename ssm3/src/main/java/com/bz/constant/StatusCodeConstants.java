package com.bz.constant;

/**
 * 状态常量定义
 */
public class StatusCodeConstants {
    /**
     * 存在
     */
    public static final int EXISTS = 2000;

    /**
     * 不存在
     */
    public static final int NOT_EXISTS = 3000;
    public static final String NOT_EXISTS_MSG = "账号不存在";

    /**
     * 冻结
     */
    public static final int FREEZE = 2100;
    public static final String FREEZE_MSG = "账号被冻结";

    /**
     * 激活
     */
    public static final int ACTIVE = 2200;

    /**
     * 余额不足
     */
    public static final int BALANCE_NOT_ENOUGH = 2300;
    public static final String BALANCE_NOT_ENOUGH_MSG = "余额不足";
    /**
     * 成功
     */
    public static final int SUCCESS = 1000;
    public static final String SUCCESS_MSG = "成功";
}
