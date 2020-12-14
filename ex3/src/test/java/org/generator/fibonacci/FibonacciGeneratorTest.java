package org.generator.fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciGeneratorTest {

    private FibonacciGenerator fibonacciGenerator;

    @Before
    public void setUp() {
        fibonacciGenerator = new FibonacciGenerator();
    }

    @Test
    public void shouldReturnFibonacciNumberForStartingPositions() {
        assertEquals(0, fibonacciGenerator.getFibNumber(0));
        assertEquals(1, fibonacciGenerator.getFibNumber(1));
    }

    @Test
    public void shouldReturnFibonacciNumberForLaterPositions() {
        assertEquals(1, fibonacciGenerator.getFibNumber(2));
        assertEquals(2, fibonacciGenerator.getFibNumber(3));
        assertEquals(3, fibonacciGenerator.getFibNumber(4));
        assertEquals(5, fibonacciGenerator.getFibNumber(5));
        assertEquals(8, fibonacciGenerator.getFibNumber(6));
    }
}
