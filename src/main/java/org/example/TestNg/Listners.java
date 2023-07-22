package org.example.TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

    public void onStart(ITestResult result){
        System.out.println("Test execution started "+result.getName());
    }
    public void onTestSuccess(ITestResult result){
        System.out.println("Test execution successful "+result.getName());
    }
    public void onTestFailure(ITestResult result){
        System.out.println("Taking screenshot for the failure "+result.getName());
    }
    public void onTestSkipped(ITestResult result){
        System.out.println("Test execution got skipped "+result.getName());
    }
    public void onFinish(ITestContext context){
        System.out.println("Test execution finished "+context.getName());
    }

}
