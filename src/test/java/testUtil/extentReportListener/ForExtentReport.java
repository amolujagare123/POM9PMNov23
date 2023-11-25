package testUtil.extentReportListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ForExtentReport {

    public static ExtentReports initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("All sites Demo");
        reporter.config().setReportName("functionality test report");

        extent.setSystemInfo("Project Name","Stock Management System");
        extent.setSystemInfo("Dev Name","Shainita");
        extent.setSystemInfo("Project Deadline","31 Dec 2023");
        extent.setSystemInfo("Release date","18 Oct 2023");
        extent.setSystemInfo("Sprint","SP12.3333");

         return  extent;

    }
}
