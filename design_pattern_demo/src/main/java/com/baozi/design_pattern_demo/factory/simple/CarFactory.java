package com.baozi.design_pattern_demo.factory.simple;

public class CarFactory {
    public static Car getCat(String brand){
        if ("特斯拉".equals(brand)){
            return new TeslaCar();
        }else if("宝马".equals(brand)){
            return new BMWCar();
        }else{
            return null;
        }
    }
}
