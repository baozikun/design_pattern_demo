package com.baozi.design_pattern_demo.singleton;

/**
 * 饿汉式
 *
 */
public  class Singleton01 {
    private static Singleton01 instance  = new Singleton01();
    private Singleton01(){ }
    public static Singleton01 getInstance(){
        return instance;
    }
}
