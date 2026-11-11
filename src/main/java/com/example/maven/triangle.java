package com.example.maven;

public class triangle {

    /**
     * Calculates the area of a triangle given its base and height.
     * Formula: Area = 0.5 * base * height
     * 
     * @param base the base of the triangle
     * @param height the height of the triangle
     * @return the calculated area
     */
    public double getArea(double base, double height) {
        if (base < 0 || height < 0) {
            throw new IllegalArgumentException("Base and height must be non-negative numbers.");
        }
        return 0.5 * base * height;
    }
}