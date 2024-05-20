package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class NumberConversionTest {


    @Test
    void testConvertToInt_NullInput() {
        String input = null;
        Assertions.assertThrows(NumberFormatException.class, () -> NumberConversion.convertToInt(input),
                "Input string cannot be null or empty.");
    }

    @Test
    void testConvertToInt_EmptyInput() {
        String input = "   ";
        Assertions.assertThrows(NumberFormatException.class, () -> NumberConversion.convertToInt(input),
                "Input string cannot be null or empty.");
    }

    @Test
    void testConvertToInt_SuccessCase() throws NumberConversion.NumberOutOfRangeException {
        String input = "$108,471";
        int expected = 108471;
        int result = NumberConversion.convertToInt(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testConvertToInt_OutOfRangeException() {
        String input = "2147483648";
        Assertions.assertThrows(NumberConversion.NumberOutOfRangeException.class, () -> NumberConversion.convertToInt(input),
                "Number is out of the valid range for an integer.");
    }

}