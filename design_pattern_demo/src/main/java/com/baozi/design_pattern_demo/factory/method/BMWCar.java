package com.baozi.design_pattern_demo.factory.method;

public class BMWCar implements Car {
    private String brand;


    @Override
    public String getCarBrand() {
        return "宝马";
    }
}
