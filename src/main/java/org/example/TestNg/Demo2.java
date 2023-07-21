package org.example.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
    @Test
    public void test1(){
        Assert.assertEquals(9,9); //pass
        int a=10;
        Assert.assertTrue(a>0); //pass
       // Assert.assertEquals("Hi","Bye"); //fail
        Assert.assertNotEquals("hi","bye"); //pass
        Assert.assertFalse(a<10); //pass

    }

    @Test(enabled = false) //this test method won't be executed
    public void test2(){
        int age=8;
        if(age<18){
            Assert.fail("age is less than 18"); //manually failing the test case
        }
    }
}
