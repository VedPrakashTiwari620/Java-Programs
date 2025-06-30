package com.example.challenges77__90.challenge81;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Ved Prakash Tiwari",21);
        Person p2 = new Person("Ved Prakash Tiwari",21);


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        if (p1.equals(p2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
