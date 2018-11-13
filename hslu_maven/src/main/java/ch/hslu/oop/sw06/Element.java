package ch.hslu.oop.sw06;

/**
 * Abstract class Element - write a description of the class here
 *
 * @author Remo Giger
 * @version 1.0.0
 */
public abstract class Element
{
    protected float liquidTemp;
    protected float vaporTemp;
    protected String name;
    

    public String getAggregateState(float actualTemp)
    {
        if(actualTemp >= this.liquidTemp){
            return "flüssig";
        }
        else if(actualTemp>= vaporTemp)
        {
            return "gasförmig";
        }
        else
        {
            return "fest";
        }
    }
    @Override
    public String toString(){
        return "";
    }
}