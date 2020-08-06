package com.unitTest;

import com.HomeworkWednesday.Calculator;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculationTest {
    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        assertEquals(4, calculator.sum(2, 2));

    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.sub(2, 2));
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.div(6, 3));
    }


    @Test
    public void testDivZero() throws IOException {
        Calculator calculator = new Calculator();
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            calculator.div(6, 0);
        });
    }

    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        assertEquals(18, calculator.mul(6, 3));
    }
}
