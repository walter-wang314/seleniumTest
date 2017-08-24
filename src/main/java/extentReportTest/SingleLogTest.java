package extentReportTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ReporterType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SingleLogTest extends BaseExample {
    private final String filePath = "file-path.html";

    @BeforeClass
    public void beforeClass() {
        extent = new ExtentReports(filePath, true);
        extent.startReporter(ReporterType.DB, "extent.db");
        extent.addSystemInfo("Host Name", "Anshoo");
    }

    @Test
    public void passTest() {
        test = extent.startTest("passTest");
        test.log(LogStatus.PASS, "Pass");
        Assert.assertEquals(test.getRunStatus(), LogStatus.PASS);
    }

    @Test
    public void intentionalFailure() {
        test = extent.startTest("intentionalFailure");
        test.log(LogStatus.FAIL, "Fail");
        Assert.assertEquals(test.getRunStatus(), LogStatus.PASS);
    }
}

