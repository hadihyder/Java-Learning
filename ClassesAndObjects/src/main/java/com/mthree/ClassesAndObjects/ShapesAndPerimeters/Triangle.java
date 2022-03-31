package com.mthree.ClassesAndObjects.ShapesAndPerimeters;

public class Triangle extends Shape{

    private double area, perimeter;
    private double side1, side2, base, height;

    @Override
    public double getArea() {
        area = (0.5) * base * height;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = side1 + side2 + base;
        return perimeter;
    }
}
