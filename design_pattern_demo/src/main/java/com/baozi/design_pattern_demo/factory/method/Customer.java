package com.baozi.design_pattern_demo.factory.method;

public class Customer {
    public static void main(String[] args) {
        Car car = new TeslaCarFactory().getCar();
        Car car2 = new BMWCarFactory().getCar();
        System.out.println(car.getCarBrand());
        System.out.println(car2.getCarBrand());
    }
}
