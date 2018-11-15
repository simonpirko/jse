package com.example.generics;

import java.util.ArrayList;
import java.util.ListIterator;

public class GenericsTest<T> {
    private T var1;
    private T var2;
    private T[] e;

    public GenericsTest(T var1, T var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public static void main(String[] args) {
        GenericsTest<String> g = new GenericsTest<>("A", "B");
//        g.gen();
    }

    public void gen(Object a) {
        e = (T[]) new Object[10];
//        T[] abc = new T[10]; error
        System.out.println(var1 + " " + var2 + " " + a.getClass().getName());
    }
}
