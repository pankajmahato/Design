package com.pankajmahato.designpatterns.singleton;

public enum EnumSingleton {
    INSTANCE;

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        counter++;
    }
}
