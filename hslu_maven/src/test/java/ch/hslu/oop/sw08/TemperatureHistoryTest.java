package ch.hslu.oop.sw08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ch.hslu.oop.sw08.Temperature;;

public class TemperatureHistoryTest {
    @Test
    public void min() throws Exception {
        TemperatureHistory history = new TemperatureHistory();
        assertEquals(0, history.max(), 0.1);
    }

    @Test
    public void max() throws Exception {
        Temperature temp1 = new Temperature(50.f);
        Temperature temp2 = new Temperature(40.f);
        Temperature temp3 = new Temperature(30.f);

        TemperatureHistory history = new TemperatureHistory();
        history.addTemperature(temp1);
        history.addTemperature(temp2);
        history.addTemperature(temp3);
        assertEquals(50f, history.max(), 0.1f);
    }

    @Test
    public void averageTemperature() throws Exception {
        Temperature temp1 = new Temperature(50.f);
        Temperature temp2 = new Temperature(40.f);
        Temperature temp3 = new Temperature(30.f);

        TemperatureHistory history = new TemperatureHistory();
        history.addTemperature(temp1);
        history.addTemperature(temp2);
        history.addTemperature(temp3);
        assertEquals(40f, history.averageTemperature(), 2);
    }
    
    /**Test bei 0 rückgabewerten
    @Test
    puplic void averageTempeatureempty() throws Exception {
        TemperatureHistory
    }
*/
}