package unittesting;

import org.junit.*;


public class CalculatorTestUsingJunit5 {
    // we don't need main method for testing purpose

    @Test// timeout is used to check method performance, how fast it is working
    public void TestDoSummation() {
        // Verify Expected Result vs Actual Result
        int expectedResult = 70;
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
    public void TestDoSum() {
        int expectedResult = 75;
        int actualResult = Calculator.doSum(20, 50);
        Assert.assertNotEquals("Test Fail ", expectedResult, actualResult); // if not matching will throw test fail message


    }

    // First Before Method will Execute
    @Before
    public void startUnitTesting() {
        System.out.println("Start Unit Testing ");

    }

    @After
    public void endUnitTesting() {
        System.out.println("End Unit Testing");
    }

    //
    @BeforeClass
    public static void Welcome() {
        System.out.println("Welcome to Unit Testing");
    }

    @AfterClass
    public static void goodBye() {
        System.out.println("Good bye");
    }


}


