package unittesting;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

public class CalculatorTest {
    // we don't need main method for testing purpose
    @Test(timeout = 50) // timeout is used to check method performance, how fast it is working
    public void TestDoSummation() {
        // Verify Expected Result vs Actual Result
        int expectedResult = 0;
        int actualResult = Calculator.doSum(20, 50);
        Assert.assertEquals("Test Fail ", expectedResult, actualResult); // if not matching will throw test fail message

//        if (expectedResult == actualResult) {
//            System.out.println("Test pass ");
//        } else {
//            System.out.println("Test fail");
//        }
    }

    @Test
    public void TestDoSubstraction() {
        int expResult = 20;
        int actResult = Calculator.doSub(30, 10);
        Assert.assertEquals("Test Fail", expResult, actResult);

    }

    //Negative Testing
    @Test
    @Ignore
    public void TestDoSum() {
        int expectedResult = 75;
        int actualResult = Calculator.doSum(20, 50);
        Assert.assertNotEquals("Test Fail ", expectedResult, actualResult); // if not matching will throw test fail message


    }

@Test
    public void TestDoMultiplication() {
        int expectedResult=300000;
   //     int sult= Calculator.doMultiplication();

    }

    ;


}