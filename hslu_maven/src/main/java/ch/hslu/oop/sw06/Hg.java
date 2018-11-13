package ch.hslu.oop.sw06;

public class Hg extends Element {

    public Hg() {
        super.liquidTemp = 234.32f;
        super.vaporTemp = 630.2f;
    }

    @Override
    public String toString() {
        return super.toString() + "GIFTIG";
    }
}