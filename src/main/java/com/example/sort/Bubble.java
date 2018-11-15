package com.example.sort;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Bubble {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        // int c = 0;

        Date date = new Date();
        Random random = new Random();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        // SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("ss");

        System.out.println("Start farr " + simpleDateFormat.format(date));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println("End arr " + simpleDateFormat.format(date));

        Long t1 = new Date().getTime();

        Thread thread = new Thread(new BSort(numbers));
        thread.start();
        System.out.println("Start sorting ");
        for (int number : numbers) {
            for (int y = 1; y < numbers.length; y++) {
                if (numbers[y - 1] > numbers[y]) {
                    swap(y, y - 1, numbers);
                }
            }
            // System.out.println(c);
        }
        Long t2 = new Date().getTime();
        System.out.println("End sorting ");
        System.out.println("Sorting time " + ((t2 - t1) / 1000) + "sec " + "total elements " + numbers.length);
    }

    public static void swap(int a, int b, int[] arr) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
