package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.interfaces.Shape;
import edu.cmu.cs.cs214.lab02.shapes.models.Circle;
import edu.cmu.cs.cs214.lab02.shapes.models.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.models.Square;
import edu.cmu.cs.cs214.lab02.shapes.utils.Renderer;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(4);
        Shape square = new Square(5);

        Renderer renderer1 = new Renderer(rectangle);
        Renderer renderer2 = new Renderer(circle);
        Renderer renderer3 = new Renderer(square);

        renderer1.draw();
        renderer2.draw();
        renderer3.draw();
    }
}
