package ExtendReportListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtendReport implements ITestListener {
    public static int Total = 0;
    public static int Pass = 0;
    public static int fail = 0;
    public static int skip = 0;
    @Override
    public void onTestStart(ITestResult iTestResult) {
        Total++;
    }
    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Pass++;
    }
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        fail++;
    }
    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        skip++;
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }
    @Override
    public void onStart(ITestContext iTestContext) {
    }
    @Override
    public void onFinish(ITestContext iTestContext) {
    }
}


