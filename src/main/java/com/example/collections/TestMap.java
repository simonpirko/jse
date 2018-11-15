package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, Map<Integer, String>> integerStringMap = new HashMap<>();
        Map<Integer, String> integerStringMap1 = new HashMap<>();
        integerStringMap1.put(1, "Andrew");
        integerStringMap1.put(2, "Andrew 2");
        integerStringMap1.put(3, "Andrew 3");
        integerStringMap1.put(4, "Andrew 4");
        integerStringMap1.put(5, "Andrew 5");
        integerStringMap.put(1, integerStringMap1);
        System.out.println(integerStringMap.get(1).toString());
        System.out.println(integerStringMap.toString());
    }
}