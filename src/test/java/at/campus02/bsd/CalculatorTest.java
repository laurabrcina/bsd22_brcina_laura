package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator(); }

    @DisplayName("First test of add() method")
    @Test
    void testAdd1(){
        assertEquals(5, calculator.add(2,3));
    }

    @DisplayName("second test of add() method")
    @Test
    void testAdd2(){
        assertTrue(3 == calculator.add(1,2));
    }

    @DisplayName("third test of add() method")
    @Test
    void testAdd3(){
        assertFalse(2 == calculator.add(10,2));
    }

    @DisplayName("first test of minus() method")
    @Test
    void testMinus1(){
        assertEquals(10, calculator.minus(20,10));
    }

    @DisplayName("second test of minus() method")
    @Test
    void testMinus2(){
        assertTrue(6 == calculator.minus(12,6));
    }

    @DisplayName("third test of minus() method")
    @Test
    void testMinus3(){
        assertTrue(-10 == calculator.minus(-20,-10));
    }

    @DisplayName("fourth test of minus() method")
    @Test
    void testMinus4(){
        assertFalse(5 == calculator.minus(10,2));
    }

    @DisplayName("first test of divide() method")
    @Test
    void testDivide1(){
        assertEquals(10, calculator.divide(20,2));
    }

    @DisplayName("second test of divide() method")
    @Test
    void testDivide2(){
        assertTrue(12 == calculator.divide(12,1));
    }

    @DisplayName("third test of divide() method")
    @Test
    void testDivide3(){
        assertFalse(0 == calculator.divide(2,0));
    }

    @DisplayName("fourth test of divide() method")
    @Test
    void testDivide4(){
        assertFalse(15 == calculator.divide(10,2));
    }

    @DisplayName("first test of multiply() method")
    @Test
    void testMultiply1(){
        assertEquals(6, calculator.multiply(2,3));
    }

    @DisplayName("second test of multiply() method")
    @Test
    void testMultiply2(){
        assertTrue(10 == calculator.multiply(10,1));
    }

    @DisplayName("thitd test of multiply() method")
    @Test
    void testMultiply3(){
        assertTrue(0 == calculator.multiply(5,0));
    }

    @DisplayName("fourth test of multiply() method")
    @Test
    void testMultiply4(){
        assertTrue(0 == calculator.multiply(0,0));
    }

    @DisplayName("fifth test of multiply() method")
    @Test
    void testMultiply5(){
        assertFalse(20 == calculator.multiply(5,10));
    }

    @DisplayName("first test of factorial() method")
    @Test
    void testFactorial1(){
        assertEquals(120, calculator.factorial(5));
    }

    @DisplayName("second test of factorial() method")
    @Test
    void testFactorial2(){
        assertTrue(0 == calculator.factorial(-2));
    }

    @DisplayName("third test of factorial() method")
    @Test
    void testFactorial3(){
        assertTrue(1 == calculator.factorial(0));
    }

}

