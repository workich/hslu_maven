package ch.hslu.oop.sw06;

public class Point {
    // Instanzvariablen
    private int x;
    private int y;

    /**
     * Konstruktor Point
     */
    public Point() {
        // Instanzvariable initialisieren
        this(0, 0);
    }

    public Point(int x, int y) {
        // Instanzvariable initialisieren
        this.setPoint(x, y);
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getQuadrant(final int x, final int y) {
        int quadrant = 0;
        if (y > 0) {
            if (x > 0) {
                quadrant = 1;
            } else if (x < 0) {
                quadrant = 2;
            }
        } else if (y < 0) {
            if (x > 0) {
                quadrant = 4;
            } else if (x < 0) {
                quadrant = 3;
            }
        }

        return quadrant;
    }

    public void moveRelative(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void moveRelative(Point point) {
        this.x += point.x;
        this.y += point.y;
    }
}