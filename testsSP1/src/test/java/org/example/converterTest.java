package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class converterTest {
    @Test
    public void f32Equals0c() {
        assertEquals(0, converter.convertF(32));
    }

    @Test
    public void f212Equals100c() {
        assertEquals(100, converter.convertF(212));
    }


    @Test
    public void c50Equals122f(){
        assertEquals(122, converter.convertC(50));

    }

    @Test
    public void negative273cEqualsNegative459f(){
        assertEquals(-459, converter.convertC(-273));
    }

}