package com.example.roman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    private RomanNumeral romanNumeral;

    @Before
    public void setUp() {
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void shouldConvertASingleRomanNumeral() {

        assertEquals(1, romanNumeral.convert("I"));
        assertEquals(5, romanNumeral.convert("V"));
        assertEquals(10, romanNumeral.convert("X"));
    }

    @Test
    public void shouldConvertAnAdditionCompositeRomanNumeral() {
        assertEquals(2, romanNumeral.convert("II"));
        assertEquals(6, romanNumeral.convert("VI"));
        assertEquals(16, romanNumeral.convert("XVI"));
    }

    @Test
    public void shouldConvertASubtractionCompositeRomanNumeral() {
        assertEquals(4, romanNumeral.convert("IV"));
        assertEquals(14, romanNumeral.convert("XIV"));
        assertEquals(59, romanNumeral.convert("LIX"));
    }

}


// IV --> 4
// V, VI, VII,