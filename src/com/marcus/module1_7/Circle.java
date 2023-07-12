package com.marcus.module1_7;

public class Circle extends TwoDShape {
    public static final double PI = Math.PI;

    /**
     * The radius of this circle
     */
    private final double radius;

    /**
     * Creates a new circle with the given radius
     * @param colour the desired colour
     * @param radius the desired radius
     */
    public Circle(Colour colour, double radius) {
        super(colour, radius * 2, radius * 2);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * (this.radius * this.radius); // pi * r^2 = area
    }

    @Override
    public String toString() {
        return "Circle{" +
                "colour=" + this.getColour() +
                ", radius=" + radius +
                '}';
    }
}
