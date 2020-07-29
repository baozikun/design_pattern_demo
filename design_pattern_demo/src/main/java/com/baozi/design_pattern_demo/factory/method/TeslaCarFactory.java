package com.baozi.design_pattern_demo.factory.method;



public class TeslaCarFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new TeslaCar();
    }
}
