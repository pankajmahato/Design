package com.pankajmahato.designpatterns.bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Rendering Circle using Raster with Radius " + radius);
    }
}
