package ch.hslu.oop.sw08;

/**
 * Write a description of class Hg here.
 *
 * @author Remo Giger
 * @version 1.0.0
 */
public class Hg extends Element {

    public Hg() {
        super.liquidTemp = 234.32f;
        super.vaporTemp = 630.2f;
        super.name = "HG";
    }

    public Hg(float temp) {
        super(temp);
        super.liquidTemp = 234.32f;
        super.vaporTemp = 630.2f;
        super.name = "HG";
    }
}