package ch.hslu.oop.sw07;

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

    @Override
    public String toString() {
        return super.toString() + "GIFTIG";
    }
}