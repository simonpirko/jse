package com.example.oop;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractClassA {


    protected List<Integer> integerList;

    public AbstractClassA(List<Integer> integerList) {
        this.integerList = integerList;
    }

    abstract public void abc();

    public List<Integer> getIntegerList() {
        return integerList;
    }
}
