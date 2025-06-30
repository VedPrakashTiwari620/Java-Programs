package in.kgcoding.equals;

import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.StringJoiner;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)){
            return false;
        }
        Person per = (Person) obj;

        return per.name.equals(name) && per.age==age && per.id==id;
    }

// Created by IDE Generator equals Object Class Methods

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && id == person.id && Objects.equals(name, person.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("age=" + age)
                .add("name='" + name + "'")
                .add("id=" + id)
                .toString();
    }

}
