package com.example.oop;

import org.jetbrains.annotations.NotNull;

public class Manager extends Employee {

    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary() * bonus;
    }

    public void abc() {
        System.out.println("Cast to abc()");
    }
}
