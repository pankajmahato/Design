package com.pankajmahato.designpatterns.decorator;

public class MilkDecorator extends BaseCoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
