package extentReportTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public abstract class BaseExample {
    protected ExtentReports extent;
    protected ExtentTest test;

    @AfterMethod
    protected void afterEachTest(ITestResult result) {
        if (!result.isSuccess()) {
            test.log(LogStatus.FAIL, result.getThrowable());
        }
        extent.endTest(test);
        extent.flush();
    }

    @AfterSuite
    protected void afterSuite() {
        extent.close();
    }
}