package com.baozi.design_pattern_demo.singleton;

/**
 * 静态内部类
 *
 */
public  class Singleton04 {
    private Singleton04(){ }
    public static class Singleton04_Inner{
        private static final  Singleton04 INSTANCE = new Singleton04();
    }
    public static Singleton04 getInstance(){
        return Singleton04_Inner.INSTANCE;
    }
}
