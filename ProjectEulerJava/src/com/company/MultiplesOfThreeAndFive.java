package com.company;

public class MultiplesOfThreeAndFive {
    public int calculate(int input) {

        int sumOfMultiples = 0;
        int firstMultiple = 3;
        int secondMultiple = 5;

        for (int current = 0; current < input; current++)
        {
            if (current % firstMultiple == 0
            || current % secondMultiple == 0)
            {
                sumOfMultiples += current;
            }
        }

        return sumOfMultiples;
    }
}
