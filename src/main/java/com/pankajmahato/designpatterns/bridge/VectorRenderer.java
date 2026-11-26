package com.pankajmahato.designpatterns.bridge;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Rendering Circle using Vector with Radius " + radius);
    }
}
