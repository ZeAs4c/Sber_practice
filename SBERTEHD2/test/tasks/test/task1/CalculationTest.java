package tasks.test.task1;

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
        int a=0;
        a=calculator.sum(2, 2);
        assertEquals(4, a);

    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a=0;
        a=calculator.sub(2, 2);
        assertEquals(0, a);
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        int a=0;
        a=calculator.div(6, 3);
        assertEquals(0, a);
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
        int a=0;
        a=calculator.mul(6, 3);
        assertEquals(18, a);
    }
}
