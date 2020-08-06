package com.unitTest;

import com.HomeworkWednesday.Quadratic_equation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationTest {
    @Test
    public void tesTworRots() {
        // Given
        Quadratic_equation Quadratic = new Quadratic_equation();
        // When

        assertEquals("-0.07417596432748041 -53.92582403567252",Quadratic.quadraticEquation(1,54,4), "0.0001");
    }

    @Test
    public void testOne_root() {
        Quadratic_equation Quadratic = new Quadratic_equation();
        assertEquals("-2.0",Quadratic.quadraticEquation(1, 4, 4), "0.0001");
    }
    @Test
    public void testNaN_root() {
        Quadratic_equation Quadratic = new Quadratic_equation();
        assertEquals( "Уравнения не существует",  Quadratic.quadraticEquation(0, 0, 0));
    }
    @Test
    public void testNaNinf_root() {
        Quadratic_equation Quadratic = new Quadratic_equation();
        assertEquals( "Уравнения не существует",  Quadratic.quadraticEquation(0, 1, 2));
    }
    @Test
    public void testNoRoot() {
        Quadratic_equation Quadratic = new Quadratic_equation();
        assertEquals( "Уравнение не имеет квадратных корней",  Quadratic.quadraticEquation(1, 2, 3));
    }
}
