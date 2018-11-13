package ch.hslu.oop.sw07;

public class Pb extends Element {

    public Pb() {

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