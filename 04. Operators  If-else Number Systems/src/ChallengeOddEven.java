import java.util.Scanner;

public class ChallengeOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Odd Even Checker");
        int num = input.nextInt();
        int n = 0;

        if (num % 2 == 0){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }

//        for(int i = 1; i<=1000;i++){
//            n+= i;
//        }
////        System.out.println(n);

    }
}
