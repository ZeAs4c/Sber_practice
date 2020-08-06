package tasks.test.task2;

import com.HomeworkWednesday.task2.Quadratic_equation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationTest {
    @Test
    public void tesTworRots() {
        // Given
        Quadratic_equation Quadratic = new Quadratic_equation();
        // When
        List<Double> arr = new ArrayList<>();
        List<Double> arrr = new ArrayList<>();
        arr.add(-53.92582403567252);
        arr.add(-0.07417596432748041);
        arrr=Quadratic.quadraticEquation(1,54,4);
        assertEquals(arr,arrr);
    }

    @Test
    public void testOne_root() {
        Quadratic_equation Quadratic = new Quadratic_equation();
        List<Double> arr = new ArrayList<>();
        List<Double> arrr = new ArrayList<>();
        arr.add(-2.0);
        arrr=Quadratic.quadraticEquation(1, 4, 4);
        assertEquals(arr,arrr);
    }
    @Test
    public void testNaN_root() {
        Quadratic_equation Quadratic = new Quadratic_equation();
        List<Double> arr = new ArrayList<>();
        List<Double> arrr = new ArrayList<>();
        arrr=Quadratic.quadraticEquation(0, 0, 0);
        assertEquals( arr,arrr);
    }
    @Test
    public void testNaNinf_root() {
        Quadratic_equation Quadratic = new Quadratic_equation();
        List<Double> arr = new ArrayList<>();
        List<Double> arrr = new ArrayList<>();
        arrr=Quadratic.quadraticEquation(0, 1, 2);
        assertEquals( arr, arrr );
    }
    @Test
    public void testNoRoot() {
        Quadratic_equation Quadratic = new Quadratic_equation();
        List<Double> arr = new ArrayList<>();
        List<Double> arrr = new ArrayList<>();
        arrr=Quadratic.quadraticEquation(1, 2, 3);
        assertEquals( arr, arrr );
    }
}
