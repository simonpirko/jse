package com.example.hort;

public class TestBlock {

    TestBlock() {
        System.out.println("Constructor one");
    }

    static int a = 5;

    static {
        System.out.println(a);
        System.out.println("Static one");
    }

    static {
        int n;
        System.out.println("Static two");
    }

    {
        {
//            int n; error
            System.out.println("Inner block two");
        }
        System.out.println("Block two");
    }

    {
        System.out.println("Block one");
    }

    public static void main(String[] args) {
//        new TestBlock();
        int goal = 890;
        int res = 0;

        while (res < goal) {
            res++;
        }

        System.out.println(res);

    }
}
