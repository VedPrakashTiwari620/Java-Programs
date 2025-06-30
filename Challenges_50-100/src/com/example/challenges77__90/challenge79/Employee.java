package com.example.challenges77__90.challenge79;

public class Employee {
    private String name;
    private int age;
    private double salary;


    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    String displayEmployeeDetails(){
        return "Employee Details: [".concat(name+" ").concat(String.valueOf(age+" ")).concat(String.valueOf(salary+"]"));
    }


    public static void main(String[] args) {
        Employee emp = new Employee(24,"Ved Prakash Tiwari",750000);
        emp.setName("Ved Prakash Tiwari");
        emp.setAge(24);
        emp.setSalary(75000);

        System.out.println(emp.displayEmployeeDetails());
    }

}
