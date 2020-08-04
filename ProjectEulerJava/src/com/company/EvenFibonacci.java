package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class EvenFibonacci {
    public static List<Integer> calculateFibonacciNumbersBelowValue(int maximumValue) {

        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();

        int firstFibonacci = 1;
        int secondFibonacci = 2;

        fibonacciNumbers.add(firstFibonacci);
        fibonacciNumbers.add(secondFibonacci);

        int nextFibonacci = firstFibonacci + secondFibonacci;

        while (nextFibonacci < maximumValue) {

            fibonacciNumbers.add(nextFibonacci);

            firstFibonacci = secondFibonacci;
            secondFibonacci = nextFibonacci;
            nextFibonacci = firstFibonacci + secondFibonacci;

        }

        return fibonacciNumbers;
    }

    public static int calculateSumOfEvenFibonacciNumbersBelowValue(int cap) {
        
        List<Integer> fibonaccis = calculateFibonacciNumbersBelowValue(cap);
        int sumOfEvenFibonaccis = 0;

        for (int fibonacci:
             fibonaccis) {
            if (fibonacci % 2 == 0)
                sumOfEvenFibonaccis += fibonacci;
        }


        return sumOfEvenFibonaccis;
    }
}
