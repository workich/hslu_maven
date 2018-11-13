package ch.hslu.oop.sw02;

public class Temperatur {
    float tKelvin;

    public Temperatur() {
        tKelvin = 293.15f;
    }

    public Temperatur(float temp) {
        tKelvin = temp;
    }

    public float getTemp() {
        return tKelvin;
    }

    public void setTemp(float newTemp) {
        tKelvin = newTemp;
    }

    public float getTempCelsius() {
        return tKelvin - 273.15f;
    }

    public float getTempFarenheit() {
        return tKelvin * (9.0f / 5.0f) - 459.67f;

    }
}
