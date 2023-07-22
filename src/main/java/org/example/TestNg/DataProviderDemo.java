package org.example.TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @Test(dataProvider = "getData")
    public void loginTest(String username,String password){
        System.out.println("user logged in using credentials as : "+username+" "+password);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data=new Object[3][2];
        data[0][0]="arun";
        data[0][1]="12345";
        data[1][0]="tarun";
        data[1][1]="12335";
        data[2][0]="varun";
        data[2][1]="12445";
        return data;
    }
}
