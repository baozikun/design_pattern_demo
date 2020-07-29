package com.baozi.design_pattern_demo.factory.method;

public class TeslaCar implements Car{
    private String brand;

    @Override
    public String getCarBrand() {
        return "特斯拉";
    }
}
