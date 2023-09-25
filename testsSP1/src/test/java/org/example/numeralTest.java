package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class numeralTest {
    @Test
    public void number1EqualsI() {
        assertEquals("I", numeral.convertToRoman(1));
    }
    @Test
    public void number119EqualsCXIX() {
        assertEquals("CXIX", numeral.convertToRoman(119));
    }
    @Test
    public void number1999EqualsMCMXCIX() {
        assertEquals("MCMXCIX", numeral.convertToRoman(1999));
    }
}
