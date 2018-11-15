package com.example.properties;

import java.io.*;
import java.util.Properties;
import java.util.ResourceBundle;

public class TestBundle {
    public void bundleMethod() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("prop");
        System.out.println(resourceBundle.getString("name"));
//        Properties properties = new Properties();
//        Object a = "Object";
    }

    public void testProperties(){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("/prop.properties"));
            System.out.println(properties.getProperty("name"));
        } catch (IOException e) {
            System.out.println("IO Exception" + e);
        }
    }

    public static void main(String[] args) {
//        new TestBundle().bundleMethod();
        new TestBundle().testProperties();
    }
}