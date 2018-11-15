package com.example.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);
        System.out.println(integers.toString());

        LinkedList<Integer> integersLink = new LinkedList<>();
        integersLink.add(4);
        integersLink.add(6);
        integersLink.add(5);
        integersLink.add(7);
        ListIterator<Integer> integerListIterator = integersLink.listIterator();
        integerListIterator.add(8);
        System.out.println(integersLink.toString());
    }
}
