import java.util.Scanner;

public class GradeBasedMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the grade based Marks!");
        System.out.print("Enter your Percentage:");
        int perc = input.nextInt();

        if (perc>=90){
            System.out.println("Your grade is A+");
        } else if (perc>=75) {
            System.out.println("Your grade is B");
        } else if (perc >=60) {
            System.out.println("Your grade is C");
        } else if (perc>=30) {
            System.out.println("Your grade is D");
        }else{
            System.out.println("You have Failed");
        }


    }
}
