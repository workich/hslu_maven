package ch.hslu.oop.sw08;

import java.util.Objects;

import ch.hslu.oop.sw07.Temperatur;


public abstract class Element {
    public enum AggregatState {
        LIQUID("flüssig"), SOLID("fest"), GAS("gasförmig");
        private String name;

        AggregatState(String german) {
            this.name = german;
        }

        public String getName() {
            return name;
        }

    }

    public float liquidTemp;
    public float vaporTemp;
    public String name;
    public Temperature temp;

    public Element(float temp) {
        this.temp = new Temperature(temp);
    }

    public Element() {
        this.temp = new Temperature(0f);
    }

    public float getCurrentTemperature() {
        return temp.getTemperaturKelvin();
    }

    public float getCurrentTemperatureCelsius() {
        return temp.getTemperaturCelsius();
    }

    public float getCurrentTemperatureFarenheit() {
        return temp.getTemperaturFahrenheit();
    }

    public void setCurrentTemperature(float currentTemp) {
        temp.setTemperaturKelvin(currentTemp);
    }

    public AggregatState getAggregateState(float actualTemp) {
        if (actualTemp >= vaporTemp) {
            return AggregatState.GAS;
        } else if (actualTemp >= this.liquidTemp) {
            return AggregatState.LIQUID;
        } else {
            return AggregatState.SOLID;
        }
    }

    @Override
    public String toString() {
        return this.name + " ist bei " + temp.getTemperaturKelvin() + " °C "
                + this.getAggregateState(temp.getTemperaturKelvin()).name;
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
        return Objects.hash(this.temp.getTemperaturKelvin(), this.name);
    }
}