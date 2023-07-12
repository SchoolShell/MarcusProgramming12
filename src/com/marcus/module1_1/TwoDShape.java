package com.marcus.module1_1;

/**
 * Represents a 2d shape
 */
public class TwoDShape {
    /**
     * The width of the shape
     */
    private double width;
    /**
     * The height of the shape
     */
    private double height;

    public TwoDShape() {}

    /**
     * Creates a 2d shape with the given width and height
     * @param width the width of the shape
     * @param height the height of the shape
     */
    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the area of this shape
     * @return the area of this shape
     */
    public double getArea() {
        return this.width * this.height;
    }

    /**
     * Sets the height of this shape
     * @param height the desired height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "TwoDShape{" +
                "width=" + this.width +
                ", height=" + this.height +
                '}';
    }
}
