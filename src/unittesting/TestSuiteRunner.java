package unittesting;

import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSuiteRunner {


    @Test
    public void TestSuiteRunner() {
        Result result = JUnitCore.runClasses(TestSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Result == " + result.wasSuccessful());


    }

}
