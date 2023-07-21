package org.example.TestNg;

import org.testng.annotations.Test;

public class Demo4 {
    @Test(timeOut = 10000) //if this test method (on the whole) is not executed within 5 sec then it will throw exception
    public void test1() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("testing after 6 sec...");
        Thread.sleep(4000);
        System.out.println("testing after 4 sec...");

    }
    //test1 passes

    @Test(timeOut = 10000)
    public void test2() throws InterruptedException {
        Thread.sleep(6000);
        System.out.println("testing after 6 sec...");
        Thread.sleep(4000);
        System.out.println("testing after 4 sec...");

    }
    //test2 fails - as it shouldn't take equal or more than the time mentioned in timeout
}
