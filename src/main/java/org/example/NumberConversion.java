package org.example;

public class NumberConversion {


    public static void main(String[] args) {
        String number = "$108,471";
        try {
            int result = convertToInt(number);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int convertToInt(String numStr) throws NumberOutOfRangeException {
        if (numStr == null || numStr.trim().isEmpty()) {
            throw new NumberFormatException("Input string cannot be null or empty.");
        }
        try {
            String numString = numStr.replaceAll("[^0-9]", "");
            int num = Integer.parseInt(numString);
            return num;
        } catch (NumberFormatException e) {

            throw new NumberOutOfRangeException("Number is out of the valid range for an integer.");

        }
    }

    static class NumberOutOfRangeException extends Exception {
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    }
}







