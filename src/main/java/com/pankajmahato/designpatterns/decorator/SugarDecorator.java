package com.pankajmahato.designpatterns.decorator;

public class SugarDecorator extends BaseCoffeeDecorator {

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
