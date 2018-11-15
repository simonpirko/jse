package com.example.junit;

import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.fail;

public class JunTest{

    private String abc;

    @BeforeEach
    public void initMe() {
        abc = "Hello";
//        System.out.println("before");
    }

//    @After
//    public void end(){
//        System.out.println("after");
//    }

    @Test
    public void test() {
        Integer a = 1000;
        Integer b = 1000;
        Assert.assertEquals("Равны", a, b);
//        Assert.assertNotNull("null", abc);
//        fail();
//        Assert.assertEquals("Тест не прошел!", 6, 2); //Assert
//        Assume.assumeTrue(true); //Assume
    }
}
