package com.example.sort;

import java.util.Arrays;

public class BSort implements Runnable {
    private int[] numbers;

    BSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.println("Start fast sort");
        Arrays.sort(numbers);
        System.out.println("End fast sort");
    }
}
