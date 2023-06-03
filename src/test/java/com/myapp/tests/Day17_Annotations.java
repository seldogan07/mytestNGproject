package com.myapp.tests;

import org.testng.annotations.*;

public class Day17_Annotations {
   @BeforeSuite
   public void beforeSuite(){
       System.out.println("Before Suite");
   }
   @BeforeTest
   public void beforeTest(){
       System.out.println("Before Test");
   }
   @BeforeGroups
   public void beforeGroups(){
       System.out.println("Before Groups");
   }
   @BeforeClass
   public static void beforeClass(){
       System.out.println("Before Class");
   }
   @BeforeMethod
   public void beforeMethod(){
       System.out.println("Before Method");
   }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("after group");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }
    @Test
    public void test1(){
        System.out.println("Test 1");
    }
    @Test
    public void test2(){
        System.out.println("Test 2");
    }
    @Test
    public void test3(){
        System.out.println("Test 3");
    }
    @Test
    public void test4(){
        System.out.println("Test 4");
    }
    @Test
    public void test5(){
        System.out.println("Test 5");
    }
    @Test
    public void test6(){
        System.out.println("Test 6");
    }
}
