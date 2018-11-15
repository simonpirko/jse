package com.example.oop;

public class Employee extends Person implements Comparable<Employee> {
    private int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(salary, o.getSalary());
    }
}
