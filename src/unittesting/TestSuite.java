package unittesting;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(    // this suite claas is coming from jUnit and it will help us run all the test cases from one suite class
        {
                CalculatorTest.class,
                CalculatorTest1.class,
                CalculatorTest2.class
        }
)
public class TestSuite {






}
