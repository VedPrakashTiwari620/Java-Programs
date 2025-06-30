package com.kgCoding.Enums;

public class TestingEnums {
    public static void main(String[] args) {

        TrafficLight color = TrafficLight.GREEN;
        color = TrafficLight.RED;



        TrafficLight trafficLight = TrafficLight.valueOf("RED");
        System.out.println();


        for (TrafficLight value : TrafficLight.values()) {
            System.out.println(value);
        }

    }

}
