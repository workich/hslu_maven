package ch.hslu.oop.sw08;

/**
 * Write a description of class N here.
 *
 * @author Remo Giger
 * @version 1.0.0
 */
public class N extends Element {

    public N() {
        // initialise instance variables
        super.liquidTemp = 63.05f;
        super.vaporTemp = 77.15f;
        super.name = "N";
    }

    public N(float temp) {
        super(temp);
        // initialise instance variables
        super.liquidTemp = 63.05f;
        super.vaporTemp = 77.15f;
        super.name = "N";
    }

}