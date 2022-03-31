package com.mthree.ClassesAndObjects.ShapesAndPerimeters;

public class Square extends Shape{

    private double area, perimeter;
    private double sideLength;


    @Override
    public double getArea() {
        area = sideLength * sideLength;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = sideLength + sideLength + sideLength + sideLength;
        return perimeter;
    }
}
