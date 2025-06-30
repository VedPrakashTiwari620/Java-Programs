import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls Enter your Age:");
        int age = sc.nextInt();
        if(age<=13){
            System.out.println("You are Child");
        } else if (age<=20) {
            System.out.println("You are Teen");
        } else if (age<=60) {
            System.out.println("You are Adult");
        }else {
            System.out.println("You are Senior Citizen");
        }
    }
}
