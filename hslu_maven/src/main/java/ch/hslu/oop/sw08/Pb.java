package ch.hslu.oop.sw08;

/**
 * Write a description of class Pb here.
 *
 * @author Remo Giger
 * @version 1.0.0
 */
public class Pb extends Element {

    public Pb() {
        // initialise instance variables
        super.liquidTemp = 234.32f;
        super.vaporTemp = 630.2f;
        super.name = "PB";
    }

    public Pb(float temp) {
        super(temp);
        super.liquidTemp = 234.32f;
        super.vaporTemp = 630.2f;
        super.name = "PB";
    }
}