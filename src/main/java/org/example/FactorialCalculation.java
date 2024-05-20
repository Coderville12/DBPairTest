package org.example;

import java.math.BigInteger;

public class FactorialCalculation {

    public static void main(String[] args) {
        int[] ns = {10, 100, 1000, 10000, 100000};

        for (int n : ns) {
            BigInteger result = calculateFactorial(n);
           if(result.toString().length()<10){
               System.out.println("n = " + n + ", Only Digits of n! = "  + result);
           }else {
               System.out.println("n = " + n + ", first 10 digits of n! = " + result.toString().substring(0, 10));
           }
        }
    }

    public static BigInteger calculateFactorial(int n) {

        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));

        }
        return fact;
    }
}

