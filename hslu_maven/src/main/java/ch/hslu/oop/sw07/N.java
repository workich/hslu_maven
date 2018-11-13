package ch.hslu.oop.sw07;

public class N extends Element
{
    /**
     * Constructor for objects of class N
     */
    public N()
    {
        // initialise instance variables
        super.liquidTemp = 63.05f;
        super.vaporTemp = 77.15f;
        super.name = "N";
    }

    public N(float temp)
    {
        super(temp);
        // initialise instance variables
        super.liquidTemp = 63.05f;
        super.vaporTemp = 77.15f;
        super.name = "N";
    }

}