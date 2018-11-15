package com.example.oop;

public class TestClassB extends TestClassA {

    void test3(){
        System.out.println("Test 3");
    }

    public static void main(String[] args) {
        TestClassB testClassB = new TestClassB();
        testClassB.test3();
        TestClassA testClassA = new TestClassB();
        testClassA.test2();
        Functional functional = new TestClassB();
        Functional functional1 = new TestClassA();
        functional.test1();
        functional1.test1();
    }
}
