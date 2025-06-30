import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);


        System.out.println("Print the table of 10");
        int i = 1;

        do{
            System.out.println(10+"x" +i+" : "+10*i);
            i++;
        }while(i<=10);
        int age=-1;
        do {
            System.out.println("Enter your Valid age :");
            age= input.nextInt();

        }while(age<0 || age>100);

        System.out.println("Age is "+age);


    }
}
