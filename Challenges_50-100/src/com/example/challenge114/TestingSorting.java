package com.example.challenge114;

import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Ved", 37000),
                new Employee("Aman", 33000),
                new Employee("Raju", 36000),
                new Employee("Satyam", 47000),
                new Employee("Karan", 37500),
                new Employee("Suraj", 37400),
                new Employee("Bikas", 32000),
                new Employee("Tanesh", 67000)
        );
        System.out.println(employees);

        employees.stream()
                .sorted((emp, emp1)-> Integer.compare(emp.getSalary(), emp1.getSalary()))
                .forEach(System.out::println);


    }
}
