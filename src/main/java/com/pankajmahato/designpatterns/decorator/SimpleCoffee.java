package com.pankajmahato.designpatterns.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public double getPrice() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
