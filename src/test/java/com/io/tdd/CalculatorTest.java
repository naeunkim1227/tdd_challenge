package com.io.tdd;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator =  new Calculator();

    @Test
    void 덧셈(){
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void 뺄셈(){
        assertEquals(1, calculator.subtract(2, 1));
    }


    @Test
    void 나누기실패() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
        assertEquals("0으로 나눌 수 없습니다", exception.getMessage());
    }


    @Test
    void 나누기성공() {
        assertEquals(5, calculator.divide(10, 2));
    }


}
