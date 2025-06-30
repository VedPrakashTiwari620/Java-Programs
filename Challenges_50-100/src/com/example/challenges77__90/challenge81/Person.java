package com.example.challenges77__90.challenge81;


import java.util.Objects;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString(){
        return "Person["+
                "Name "+name+
                " Age "+age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)){
            return false;
        }
        Person per = (Person) o;
        return per.name.equals(name)&& per.age==age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }


}
