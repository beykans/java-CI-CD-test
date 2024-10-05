package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    private final CorrectMathOperations correctMath = new CorrectMathOperations();
    private final FaultyMathOperations faultyMath = new FaultyMathOperations();

    @Test
    void testCorrectAddition() {
        assertEquals(5, correctMath.add(2, 3));
    }

    @Test
    void testCorrectMultiplication() {
        assertEquals(6, correctMath.multiply(2, 3));
    }

    @Test
    void testFaultyAddition() {
        assertEquals(5, faultyMath.add(2, 3)); // This will fail
    }

    @Test
    void testFaultyMultiplication() {
        assertEquals(6, faultyMath.multiply(2, 3)); // This will also fail
    }
}