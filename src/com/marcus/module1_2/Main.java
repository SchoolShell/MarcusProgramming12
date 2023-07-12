package com.marcus.module1_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Circle(3.0));
        shapes.add(new Circle(2.0));

        shapes.add(new Triangle(1, 1, 1));
        shapes.add(new Triangle(4, 3, 5));
        shapes.add(new Triangle(9, 6, 5));
        shapes.add(new Triangle(8, 3));
        shapes.add(new Triangle(5, 2));

        for (TwoDShape shape : shapes) {
            System.out.println(shape.toString() + " " + shape.getArea());
        }
    }
}
