package com.pankajmahato.designpatterns.singleton;

public class Runner {

    public static void main(String[] args) {

        // Double locking Singleton
        System.out.println("Double locking Singleton");
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);

        System.out.println(singleton1 == singleton2);

        // Enum Singleton
        System.out.println("Enum Singleton");
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton1 == enumSingleton2);
        enumSingleton1.incrementCounter();
        enumSingleton2.incrementCounter();
        System.out.println(enumSingleton1.getCounter());
        System.out.println(enumSingleton2.getCounter());
    }
}
