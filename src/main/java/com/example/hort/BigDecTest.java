package com.example.hort;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecTest {

    Big big = new Big();


    public static void main(String[] args) {
        BigDecimal init = new BigDecimal(234);
        BigDecimal decim = init.setScale(2, RoundingMode.CEILING);
        System.out.println(decim.toString());
        int[] a = {1, 2, 2, 4, 5, 6, 6};

        for (int i : a) {
            System.out.println(i);
        }

        BigDecTest bigDecTest = new BigDecTest();
        bigDecTest.abc(new int[]{2, 4, 6});

//        bigDecTest.big.a = 6;
    }

    public void abc(int[] a) {
    }

    public class Big{
        int a = 5;
    }
}
