package ch.hslu.oop.sw06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ch.hslu.oop.sw06.Calculator;
import ch.hslu.oop.sw06.CalculatorImpl;

class CalculatorImplTest {

    @Test
    public void addition() throws Exception {
        Calculator calc = new CalculatorImpl();
        assertEquals(11, calc.addition(5, 6));
    }

    @Test
    public void additionZero() throws Exception {
        Calculator calc = new CalculatorImpl();
        assertEquals(0, calc.addition(0, 0));
    }

}
