package com.pankajmahato.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Bot implements Prototype {

    private int positionX;
    private int positionY;
    private List<String> weapons;

    public Bot(int positionX, int positionY, List<String> weapons) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.weapons = new ArrayList<>(weapons);
    }

    private Bot(Bot other) {
        this.positionX = other.positionX;
        this.positionY = other.positionY;
        this.weapons = new ArrayList<>(other.weapons);
    }

    @Override
    public Bot clone() {
        return new Bot(this);
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public List<String> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<String> weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", weapons=" + weapons +
                '}';
    }
}
