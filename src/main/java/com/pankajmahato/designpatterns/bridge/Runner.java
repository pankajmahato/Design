package com.pankajmahato.designpatterns.bridge;

public class Runner {

    public static void main(String[] args) {

        Shape vectorCircle = new Circle(new VectorRenderer(), 10);
        Shape rasterCircle = new Circle(new RasterRenderer(), 15);

        vectorCircle.draw();
        rasterCircle.draw();
    }
}
