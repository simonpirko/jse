package com.example.oop;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCompany {
    public static void main(String[] args) {
        Employee employee = new Employee("Simon", 5000);
//        System.out.println(employee.getSalary());
        Employee manager = new Manager("Vlad", 5500, 3);
//        System.out.println(manager.getSalary());

        Employee employee1 = new Manager("Denis", 6000, 2);
//        System.out.println(employee1.getName());
//        ((Manager) employee1).abc();

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(manager);
        emp.add(employee);
        emp.add(employee1);
        System.out.println(emp.get(0).getSalary());
        System.out.println(emp.get(1).getSalary());
        System.out.println(emp.get(2).getSalary());
//        emp.sort(Comparable::compareTo);
        //and
        Collections.sort(emp);
        System.out.println(emp.get(0).getSalary());
        System.out.println(emp.get(1).getSalary());
        System.out.println(emp.get(2).getSalary());
    }

    @Test
    public void test(){
        String a = "Hello";
        String b = "Hello";
//        b = a;
//        Assert.assertSame(b.hashCode(), a.hashCode());
        Assert.assertEquals(b.hashCode(), a.hashCode());
    }
}
