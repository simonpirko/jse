package com.example.oop;

public class Constr3 extends Constr2 {
    public Constr3(int a) {
        super(a);
        System.out.println("COnstr3");
    }

    public static void main(String[] args) {
        Constr3 constr3 = new Constr3(2);
    }
}
