package com.example.challenge91__100.challange96;

public class TestEnumChall96 {
    public static void main(String[] args) {
        Day day = Day.SATURDAY;
        day=Day.THRUSDAY;

        Day day1 = Day.valueOf("MONDAY");


        for (Day value : Day.values()) {
            System.out.println(value);
        }
    }
}
