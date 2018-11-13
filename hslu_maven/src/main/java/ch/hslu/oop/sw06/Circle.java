package ch.hslu.oop.sw06;

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

    /**
     *
     * @return the area of the Circle
     */
    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}