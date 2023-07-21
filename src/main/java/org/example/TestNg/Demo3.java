package org.example.TestNg;

import org.testng.annotations.*;

public class Demo3 {
    @BeforeMethod //will be executed before every test method
    public void setup(){
        System.out.println("launching browser...");
    }
    @Test(priority = 1,groups = {"smoke"})
    public void testRegistration(){
        System.out.println("Registration test got executed...");
    }
    @Test(priority = 2)
    public void testLogin(){
        System.out.println("Login test got executed...");
    }
    @Test(priority = 3,groups = {"smoke"})
    public void testHomePage(){
        System.out.println("Home test got executed...");
    }
    @AfterMethod //will be executed after every test method
    public void closure(){
        System.out.println("closing browser...");
    }
    @BeforeClass
    public void test1(){ //executes one time before the execution of the class
        System.out.println("testing before class....");
    }
    @AfterClass
    public void test2(){ //executes one time after the execution of the class
        System.out.println("testing after class....");
    }
}
