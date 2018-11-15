package com.example.hort;

import java.util.Arrays;

public class TestMethodParam {

//    private int x = 2;

    public static void abc(int[] a) {
        a[1] = 55;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.println(Arrays.toString(a));
        abc(a);
        System.out.println(Arrays.toString(a));
    }
}