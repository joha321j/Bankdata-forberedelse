package test;

import com.company.MultiplesOfThreeAndFive;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MultiplesOfThreeAndFiveTest {

    private MultiplesOfThreeAndFive _calculator;

    @Before
    public void setUp() {
        _calculator = new MultiplesOfThreeAndFive();
    }

    @Test
    public void creationTest() {
        MultiplesOfThreeAndFive temp = new MultiplesOfThreeAndFive();

        Assert.assertNotNull(temp);

    }

    @Test
    public void calculateMethodReturnsInt() {

        assertTrue(Integer.class.isInstance(_calculator.calculate(10)));
    }

    @Test
    public void calculatorCorrectnessTestOne() {

        int input = 10;
        int expectedResult = 23;

        int calculatedResult = _calculator.calculate(input);
        assertEquals(expectedResult, calculatedResult);
    }

    @Test
    public void calculatorCorrectnessTestTwo() {
        int input = 16;
        int expectedResult = 60;

        int calculatedResult = _calculator.calculate(input);
        assertEquals(expectedResult, calculatedResult);
    }

}
