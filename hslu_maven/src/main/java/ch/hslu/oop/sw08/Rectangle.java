package ch.hslu.oop.sw08;

/**
 * Write a description of class Rectangle here.
 *
 * @author Remo Giger
 * @version 1.0.0
 */

public class Rectangle extends Shape {
    private int width;
    private int height;


    public Rectangle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}