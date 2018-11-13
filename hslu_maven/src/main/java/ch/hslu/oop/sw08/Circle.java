package ch.hslu.oop.sw08;

/**
 * Write a description of class Circle here.
 *
 * @author Remo Giger
 * @version 1.0.0
 */

public class Circle extends Shape {
    private double radius;


    public Circle(int newX, int newY, double radius) {
        super(newX, newY);
        this.radius = radius;

    }


    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }


    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}