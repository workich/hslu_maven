package ch.hslu.oop.sw08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ch.hslu.oop.sw08.N;
import ch.hslu.oop.sw08.Pb;

public class ElementTest {
    @Test
    public void toStringTest() throws Exception {
        Pb pb = new Pb();
        pb.setCurrentTemperature(400f);
        assertEquals("PB ist bei 400.0 °C flüssig", pb.toString());
    }

    @Test
    public void toStringTest2() throws Exception {
        Pb pb = new Pb();
        pb.setCurrentTemperature(700f);
        assertEquals("PB ist bei 700.0 °C gasförmig", pb.toString());
    }

    @Test
    public void toStringTestN() throws Exception {
        N n = new N();
        n.setCurrentTemperature(80);
        assertEquals("N ist bei 80.0 °C gasförmig", n.toString());
    }

}