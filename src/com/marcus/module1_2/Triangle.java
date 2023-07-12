package com.marcus.module1_2;

public class Triangle extends TwoDShape {
    /**
     * The length of the first side of this triangle
     */
    private final double side1;
    /**
     * The length of the second side of this triangle
     */
    private final double side2;
    /**
     * The length of the third side of this triangle
     */
    private final double side3;

    /**
     * Creates a triangle with the specified width and height.
     * The width is used as side1, and the other two sides are calculated using pythagorean's theorem
     * @param width the width of the triangle
     * @param height the height of the triangle
     */
    public Triangle(double width, double height) {
        super(width, height);
        this.side1 = width; // set the first side as the width

        //        |\
        // height | \ side
        //        |__\
        //        0.5 * width
        // calculate the other two side lengths using pythagorean's theorem
        this.side2 = this.side3 = Math.sqrt((0.5 * width) * (0.5 * width) + height * height);
    }

    /**
     * Creates a triangle with the given side lengths
     * side1 is treated as the base of the triangle
     * @param side1 the first side length
     * @param side2 the second side length
     * @param side3 the third side length
     */
    public Triangle(double side1, double side2, double side3) {
        super(side1, 0.0);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        this.setHeight(this.heronsHeight());
    }

    /**
     * Calculates the area of this triangle using heron's formula
     * @return the area of this triangle
     */
    @Override
    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2.0;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3)); // heron's formula
    }

    /**
     * Calculates the height of this triangle using heron's formula
     * @return the height of this triangle
     */
    private double heronsHeight() {
        double s = (this.side1 + this.side2 + this.side3) / 2.0;
        double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3)); // heron's formula
        return 2.0 * area / this.side1; // derive height from base and area
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + this.side1 +
                ", side2=" + this.side2 +
                ", side3=" + this.side3 +
                '}';
    }
}
