package com.marcus.module1_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Circle(Colour.BLUE, 5.0));
        shapes.add(new Circle(Colour.RED, 3.0));
        shapes.add(new Circle(Colour.GREEN, 2.0));

        shapes.add(new Triangle(Colour.GREEN, 1, 1, 1));
        shapes.add(new Triangle(Colour.NONE, 4, 3, 5));
        shapes.add(new Triangle(Colour.BLUE, 9, 6, 5));
        shapes.add(new Triangle(Colour.BLUE, 8, 3));
        shapes.add(new Triangle(Colour.RED, 5, 2));

        for (TwoDShape shape : shapes) {
            System.out.println(shape.toString() + " " + shape.getArea());
        }
    }
}
