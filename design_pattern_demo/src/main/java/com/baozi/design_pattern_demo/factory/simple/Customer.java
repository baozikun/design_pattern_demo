package com.baozi.design_pattern_demo.factory.simple;

public class Customer {
    public static void main(String[] args) {
        Car c = CarFactory.getCat("特斯拉");
    }
}
