package com.baozi.design_pattern_demo.singleton;

/**
 * 饿汉式
 *
 */
public  class Singleton03 {
    private static volatile Singleton03 instance ;
    private Singleton03(){ }
    public static Singleton03 getInstance(){
        if (instance == null){
            instance = new Singleton03();
        }
        return instance;
    }
    public static synchronized Singleton03 getInstance2(){
        if (instance == null){
            instance = new Singleton03();
        }
        return instance;
    }

    public static  Singleton03 getInstance3(){
        if (instance == null){
            synchronized (Singleton03.class){
                if (instance == null){
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }
}
