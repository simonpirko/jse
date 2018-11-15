package com.example.oop;

import java.util.List;

public abstract class ConcreteClassA extends AbstractClassA {


    public ConcreteClassA(List<Integer> integerList) {
        super(integerList);
    }

    public void abc() {

    }

    void test() {
        integerList.add(6);
        System.out.println(integerList.get(0));
    }

    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>();
//        integers.add(2);
//        ConcreteClassA concreteClassA = new ConcreteClassA();
//        System.out.println(concreteClassA.getIntegerList().get(0));
    }
}
