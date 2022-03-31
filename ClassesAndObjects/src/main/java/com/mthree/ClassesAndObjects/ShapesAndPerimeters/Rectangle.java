package com.mthree.ClassesAndObjects.ShapesAndPerimeters;

public class Rectangle extends Shape{

    private double area, perimeter;
    private double length, breadth;

    @Override
    public double getArea() {
        area = length * breadth;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (length + breadth);
        return perimeter;
    }
}
