package com.pankajmahato.designpatterns.prototype;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Bot bot1 = new Bot(10, 20, List.of("Knife", "Gun"));

        Bot bot2 = bot1.clone();

        // Before
        System.out.println("Before");
        System.out.println(bot1);
        System.out.println(bot2);

        // After
        System.out.println("After");
        bot2.getWeapons().add("Rocket");
        System.out.println(bot1);
        System.out.println(bot2);
    }
}
