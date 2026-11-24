package com.pankajmahato.designpatterns.builder;

public class Runner {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .egg(true)
                .cheese(false)
                .onion(true)
                .size("Large")
                .build();

        System.out.println(burger);
    }
}
