package testUtil.extentReportListener;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import testUtil.OpenUrl;

import java.io.IOException;

import static testUtil.extentReportListener.ForExtentReport.initExtent;
import static testUtil.extentReportListener.ForScreenshot.bugScreenshot;

public class MyExtentReportListener extends OpenUrl implements ITestListener {

    ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
        test = extent.createTest(result.getMethod().getMethodName());
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        test.pass("this test is passed");
    }
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        test.info(result.getThrowable());
        test.fail("this test is failed");
        try {
            test.addScreenCaptureFromPath("./screenshots/"+bugScreenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
        test.skip("this test is skipped");
    }
    public void onStart(ITestContext context) {
        System.out.println("onStart");

        if (extent==null)
          extent = initExtent();

    }
    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
        extent.flush();

    }
}
