package com.mthree.ClassesAndObjects.ShapesAndPerimeters;

public class Circle extends Shape{

    private double area, perimeter;
    private double radius;
    private double pi = 3.14;

    @Override
    public double getArea() {
        area = pi * (radius * radius);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * pi * radius;
        return perimeter;
    }
}
