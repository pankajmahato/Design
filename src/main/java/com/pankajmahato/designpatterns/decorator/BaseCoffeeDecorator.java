package com.pankajmahato.designpatterns.decorator;

public abstract class BaseCoffeeDecorator implements Coffee {

    private Coffee decoratedCoffee;

    public BaseCoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
