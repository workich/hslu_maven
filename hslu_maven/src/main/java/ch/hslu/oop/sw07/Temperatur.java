package ch.hslu.oop.sw07;

import java.util.Objects;

public class Temperatur {

    private float tmpKelvin;

    public Temperatur(float tempK) {
        this.tmpKelvin = tempK;
    }

    public Temperatur() {
        this.tmpKelvin = 0.0f;
    }

    public float getTemperature() {
        return tmpKelvin;
    }

    public void setTemperature(float tmpKelvin) {
        this.tmpKelvin = tmpKelvin;
    }

    public float getTemperatureCelsius() {
        return tmpKelvin - 273.15f;
    }

    public float getTemperatureFahrenheit() {
        return tmpKelvin * (9.0f / 5.0f) - 459.67f;
    }

    public void addKelvin(float tmpKelvin) {
        if (this.tmpKelvin + tmpKelvin >= 0.0f || this.tmpKelvin + tmpKelvin <= 500.0f) {
            this.tmpKelvin += tmpKelvin;
        }
    }

    public void addCelsius(float tmpCelsius) {
        float tmpC = getTemperatureCelsius();
        tmpC += tmpCelsius;
        float tmpK = tmpC + 273.15f;
        this.tmpKelvin = tmpK;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.tmpKelvin);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Temperatur)) {
            return false;
        }
        final Temperatur other = (Temperatur) obj;
        return (other.tmpKelvin == this.tmpKelvin);
    }

    public void addFahrenheit(float tmpFahrenheit) {
        float tmpF = getTemperatureFahrenheit();
        tmpF += tmpFahrenheit;
        float tmpK = (tmpFahrenheit + 459.67f) * (5.0f / 9.0f);
        this.tmpKelvin = tmpK;
    }

    public String getAggregateState(String element) {
        switch (element) {
        case "N": {
            if (this.tmpKelvin >= 63.05f) {
                return "flüssig";
            } else if (this.tmpKelvin >= 77.15f) {
                return "gasförmig";
            } else {
                return "fest";
            }
        }
        case "Hg": {
            if (this.tmpKelvin >= 234.32f) {
                return "flüssig";
            } else if (this.tmpKelvin >= 630.2f) {
                return "gasförmig";
            } else {
                return "fest";
            }
        }
        case "Pb": {
            if (this.tmpKelvin >= 234.32f) {
                return "flüssig";
            } else if (this.tmpKelvin >= 630.2f) {
                return "gasförmig";
            } else {
                return "fest";
            }
        }
        default:
            return "Es wurde kein Element angegeben";
        }
    }
}