package com.example.hort;

import java.io.IOException;
import java.util.Properties;

public class TestY {

//    BigDecTest bigDecTest = new BigDecTest();

    public static void main(String[] args) {
//        ITestY iTestY = (a, b) -> a + b;
//        int sum = iTestY.sum(2, 4);
//        System.out.println(sum);
//        TestY testY = new TestY();
//        try {
//            testY.an();
        Properties properties = new Properties();
        properties.setProperty("name", "Simon");
        String name = (String) properties.get("name");
        System.out.println(name);
        System.out.println();
        String name1 = properties.getProperty("name");
        System.out.println(name1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        TestY testY = new TestY();
//        testY.str("Sum", iTestY);
    }

    public void an() throws IOException {
//        BigDecTest.Big big = new BigDecTest().new Big();
//        big.a = 5;
//        BigDecTest.Big big = new BigDecTest.Big(); // maybe static
//        ActionListener actionListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//                System.out.println("Java");
//            }
//        };
//        if (false) throw new IOException();
    }

    public void str(String name, ITestY iTestY) {
        System.out.println(name + " " + iTestY.sum(2, 5));
    }
}