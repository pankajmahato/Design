package com.pankajmahato.designpatterns.decorator;

public class Runner {

    public static void main(String[] args) {

        Coffee order = new SimpleCoffee();
        order = new MilkDecorator(order);
        order = new SugarDecorator(order);

        System.out.println(order.getDescription() + " = " + order.getPrice());
    }
}
