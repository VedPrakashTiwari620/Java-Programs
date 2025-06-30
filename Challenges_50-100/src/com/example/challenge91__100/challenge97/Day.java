package com.example.challenge91__100.challenge97;

public enum Day {
    SUNDAY(false), MONDAY(true), TUESDAY(true), WEDNESDAY(true), THRUSDAY(true), FRIDAY(true), SATURDAY(false);


    private final boolean isWeekday;



    Day(boolean isWeekday){
        this.isWeekday=isWeekday;
    }

    public String getType(){
        return isWeekday ? "Weekday" : "Weekend";
    }

}
