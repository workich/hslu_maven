package ch.hslu.oop.sw07;

import java.util.Objects;

public abstract class Element {
    protected float liquidTemp;
    protected float vaporTemp;
    protected String name;
    protected Temperatur temp;
    

    public Element(float temp) {
        this.temp = new Temperatur(temp);
    }

    public Element() {
        this.temp = new Temperatur(0f);
    }

    public float getCurrentTemperature() {
        return temp.getTemperature();
    }

    public float getCurrentTemperatureCelsius() {
        return temp.getTemperatureCelsius();
    }

    public float getCurrentTemperatureFarenheit() {
        return temp.getTemperatureFahrenheit();
    }

    public void setCurrentTemperature(float currentTemp) {
        temp.setTemperature(currentTemp);
    }

    public String getAggregateState(float actualTemp) {
        if (actualTemp >= this.liquidTemp) {
            return "flüssig";
        } else if (actualTemp >= vaporTemp) {
            return "gasförmig";
        } else {
            return "fest";
        }
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Element)) {
            return false;
        }
        final Element other = (Element) obj;
        return Objects.equals(other.name, this.name) && Objects.equals(other.temp, this.temp);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.temp.getTemperature(), this.name);
    }
}