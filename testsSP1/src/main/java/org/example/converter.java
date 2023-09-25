package org.example;

public class converter {
    // make fahrenheit to celius converter
    public static int convertF(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static int convertC(int celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
