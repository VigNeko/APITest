package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {
    @Test
    public void TestCase1(){
        System.out.println("这是测试用例1");

    }

    @BeforeMethod
    public void BeforeMethod1(){
        System.out.println("用例运行之前的方法");
    }

    @AfterMethod
    public void AfterMethod1(){
        System.out.println("用例运行之后的方法");
    }
}
