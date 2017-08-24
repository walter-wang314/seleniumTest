package extentReportTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;

public class MyExtentReportTest {

    static ExtentReports extent;
    static ExtentTest test;
    static String reportLocation = "report/ExtentReport.html";
    static String imageLocation = "../img/Feedback.png";

    private ExtentReports createReport() {
        return extent;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        extent = new ExtentReports(reportLocation, NetworkMode.OFFLINE);
        String img = test.addScreenCapture(imageLocation);
        test.log(LogStatus.INFO, "Image", "Image example: " + img);
        extent.endTest(test);
        ExtentTest test2 = extent.startTest("My First Test", "Sample description");
        String aimg = test2.addScreenCapture(imageLocation);
        System.out.println(img);
        test2.log(LogStatus.INFO, "Image", "Image example: " + aimg);
        extent.endTest(test2);
        extent.flush();
    }
}