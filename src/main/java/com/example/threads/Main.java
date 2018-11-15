package com.example.threads;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Th1());
        Thread thread1 = new Thread(new Th2());
        thread.start();
        thread1.start();
    }

    public static void abc() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}
