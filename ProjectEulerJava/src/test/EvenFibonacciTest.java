package test;

import com.company.EvenFibonacci;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EvenFibonacciTest {

    @Test
    public void fibonacciCalculatorReturnsArrayListTest(){

        int cap = 5;

        var returnList = EvenFibonacci.calculateFibonacciNumbersBelowValue(cap);

        assertTrue(returnList instanceof ArrayList);
    }

    @Test
    public void fourFibonacciNumbersSmallerThanSix(){
        int cap = 6;
        int expectedSizeofReturnList = 4;

        var returnList = EvenFibonacci.calculateFibonacciNumbersBelowValue(cap);

        assertEquals(expectedSizeofReturnList, returnList.size());
    }

    @Test
    public void tenthFibonacciNumberValue(){
        int cap = 100;
        int tenthFibonacciNumber = 89;

        var returnList = EvenFibonacci.calculateFibonacciNumbersBelowValue(cap);

        int calculatedTenthFibonacciNumber = returnList.get(9);

        assertEquals(tenthFibonacciNumber, calculatedTenthFibonacciNumber);
    }

    @Test
    public void sumOfEvenFibonacciNumbersBelowTen(){
        int cap = 10;
        int expectedSum = 10;

        int calculatedSum = EvenFibonacci.calculateSumOfEvenFibonacciNumbersBelowValue(cap);

        assertEquals(expectedSum, calculatedSum);
    }

    @Test
    public void sumOfEvenFibonacciNumbersBelowOneHundred(){
        int cap = 100;
        int expectedSum = 44;

        int calculatedSum = EvenFibonacci.calculateSumOfEvenFibonacciNumbersBelowValue(cap);

        assertEquals(expectedSum, calculatedSum);
    }
}
