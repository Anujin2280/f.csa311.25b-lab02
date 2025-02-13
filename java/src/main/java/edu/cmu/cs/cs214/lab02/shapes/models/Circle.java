package edu.cmu.cs.cs214.lab02.shapes.models;

import edu.cmu.cs.cs214.lab02.shapes.interfaces.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

