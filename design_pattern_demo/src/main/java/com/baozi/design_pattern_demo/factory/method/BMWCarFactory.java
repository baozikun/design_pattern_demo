package com.baozi.design_pattern_demo.factory.method;

public class BMWCarFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BMWCar();
    }
}
