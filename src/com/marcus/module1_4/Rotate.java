package com.marcus.module1_4;

/**
 * Represents something that is rotatable
 */
public interface Rotate {
    /**
     * Rotates this object 90 degrees
     */
    void rotate90();

    /**
     * Rotates this object 180 degrees
     */
    void rotate180();

    /**
     * Rotates this object
     * @param degree the number of degrees to rotate by
     */
    void rotate(double degree);
}
