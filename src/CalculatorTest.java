import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    
    @Test
    void numbersShouldAddUp() {
        assertEquals(24.0, Calculator.calculateResult('a', 15, 9));
        assertEquals(20.0, Calculator.calculateResult('a', 10, 10));
    }
    
    @Test
    void numbersShouldSubtract() {
        assertEquals(16.0, Calculator.calculateResult('s', 20, 4));
        assertEquals(25.0, Calculator.calculateResult('s', 30, 5));
    }
    
    @Test
    void numbersShouldMultiplie() {
        assertEquals(80, Calculator.calculateResult('m', 20, 4));
        assertEquals(375, Calculator.calculateResult('m', 15, 25));
    }
    
    @Test
    void numbersShouldDivide() {
        assertEquals(5, Calculator.calculateResult('d', 20, 4));
        assertEquals((double) 5 / 3, Calculator.calculateResult('d', 25, 15));
        assertEquals(0, Calculator.calculateResult('d', 20, 0)); // division by zero covered in main
    }
    
    @Test
    void wrongOperation() {
        assertEquals(0, Calculator.calculateResult('f', 0, 0));
    }
    
    @Test
    void printShouldBeRight() {
        // capturing the output
        PrintStream originalOut = System.out;
        ByteArrayOutputStream capturedOutput = new ByteArrayOutputStream();
        PrintStream testOutput = new PrintStream(capturedOutput);
        System.setOut(testOutput);
        
        //testing
        Calculator.printOptions();
        System.out.println(capturedOutput);
        assertFalse(capturedOutput.toString().isEmpty());
        
        // return the System.out
        System.setOut(originalOut);
    }
}