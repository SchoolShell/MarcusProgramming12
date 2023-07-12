package com.marcus.module1_7;


/**
 * Represents a 2d shape
 */
public abstract class TwoDShape {
    /**
     * The width of the shape
     */
    private double width;
    /**
     * The height of the shape
     */
    private double height;
    /**
     * The colour of the shape
     */
    private final Colour colour;

    public TwoDShape(Colour colour) {
        this.colour = colour;
    }

    /**
     * Creates a 2d shape with the given width and height
     * @param width the width of the shape
     * @param height the height of the shape
     */
    public TwoDShape(Colour colour, double width, double height) {
        this.colour = colour;
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the area of this shape
     * @return the area of this shape
     */
    public abstract double getArea();

    /**
     * Returns the width of this shape
     * @return the width of this shape
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the height of this shape
     * @return the height of this shape
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the width of this shape
     * @param width the desired height
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Sets the height of this shape
     * @param height the desired height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the colour of this shape
     * @return the colour of this shape
     */
    public Colour getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "TwoDShape{" +
                "width=" + this.width +
                ", height=" + this.height +
                '}';
    }
}
