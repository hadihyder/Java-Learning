package com.hadi.foundations.ClassesAndObjects.ClassModeling.House;

public class House3DDesign{
    //Declare variables
    private int faces;
    private int edges;
    private  int vertices;
    private double area;
    private double volume;
    private double distance;

    //Constructor
    House3DDesign( double userDistance) {

        this.distance = userDistance;
    }

    //Setters
    public void setEdges(int edges) {
        this.edges = edges;
    }

    public void setFaces(int faces) {
        this.faces = faces;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    //Getters
    public int getFaces() {
        return faces;
    }

    public int getEdges() {
        return edges;
    }

    public int getVertices() {
        return vertices;
    }

    public double getArea() {
        return area;
    }

    public double getDistance() {
        return distance;
    }

    public double getVolume() {
        return volume;
    }

    //Return 3d model of the house
    public void designModel(){    }

}
