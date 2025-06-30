package com.example.challenges77__90.challenge82;

public class Test {
    public static void main(String[] args) {
            int array[]=new int[]{1,2,3,4};

            ArrayOperation arr= new ArrayOperation(array);
            ArrayOperation.Statistics statistics = arr.new Statistics();
            System.out.println(statistics.mean());
            System.out.println(statistics.median());

    }
}
