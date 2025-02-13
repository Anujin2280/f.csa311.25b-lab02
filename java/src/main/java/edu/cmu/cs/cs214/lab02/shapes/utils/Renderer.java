package edu.cmu.cs.cs214.lab02.shapes.utils;

import edu.cmu.cs.cs214.lab02.shapes.interfaces.Shape;

public class Renderer {
     private Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
        System.out.println("Its area is " + shape.getArea());
    }
}
