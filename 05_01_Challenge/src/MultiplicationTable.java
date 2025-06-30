import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Pls Enter a number to print multiplication table");
        int num= input.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(num+"X"+i+"="+num*i);
            i++;
        }
        System.out.println("**********");
        for (i=1;i<=10;i++){
            System.out.println(num+"X"+i+"="+num*i);
        }
    }
}
