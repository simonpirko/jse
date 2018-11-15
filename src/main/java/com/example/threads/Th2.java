package com.example.threads;

public class Th2 implements Runnable {
    @Override
    public void run() {
        try {
            Main.abc();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
