package edu.cmu.cs.cs214.lab02.shapes.models;

import edu.cmu.cs.cs214.lab02.shapes.interfaces.Shape;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

