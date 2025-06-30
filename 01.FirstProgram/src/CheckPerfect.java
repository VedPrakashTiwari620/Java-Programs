import java.util.Scanner;

public class CheckPerfect {
    public static void perfect(int num){
        int digit=0;
        for (int i=1;i<num;i++){
            if (num%i == 0) {
                digit=digit+i;
            }
        }
        if(digit==num) System.out.println("Perfect");
        System.out.println("Not Perfect");
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter The number ");
        int num = input.nextInt();

        perfect(num);

    }
}
