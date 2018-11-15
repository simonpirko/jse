package com.example.oop;

public class TestClassE extends TestClassC {

    public void test1(int a) {
        final int b;
        System.out.println("Test");
    }

    @Override
    public void test3(int a) {
        System.out.println("HiE");
    }

    public static void testS1(){
        System.out.println("HiE");
    }

    public static void main(String[] args) {
        Functional functional = new TestClassE();
        functional.test1();
//        TestClassE testClassE = new TestClassE();
//        testClassE.test3(2);
//        testClassE.test3();
//        testS1();
//        TestClassE.testS1();
//      functional.test2();
//        Functional functional1 = new TestClassD();
    }
}
