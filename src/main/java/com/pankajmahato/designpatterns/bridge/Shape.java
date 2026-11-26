package com.pankajmahato.designpatterns.bridge;

public abstract class Shape {

    public final Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
