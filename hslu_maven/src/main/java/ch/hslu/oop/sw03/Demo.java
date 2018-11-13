package ch.hslu.oop.sw03;

/**
 * Write a description of class Demo here.
 *
 * @author Remo Giger
 * @version 1.0.0
 */
public class Demo {
  
    public Demo() {
    }

    public int max(final int a, final int b, final int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public int min(final int a, final int b, final int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}