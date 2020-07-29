package com.baozi.design_pattern_demo.singleton;

/**
 * 饿汉式
 *
 */
public  class Singleton02 {
    private static Singleton02 instance ;
    static {
        instance = new Singleton02();
    }
    private Singleton02(){ }
    public static Singleton02 getInstance(){
        return instance;
    }
}
