package com.example.challenges51__76;

import java.util.Scanner;

class EnhSwitchMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no to print month [1 - 12] respectively [Jan - Dec");
        int dMonth= input.nextInt();



        String month = switch (dMonth){
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sep";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";

            default -> "Invalid";
        };

        System.out.println("The Month is "+month);
    }
}
