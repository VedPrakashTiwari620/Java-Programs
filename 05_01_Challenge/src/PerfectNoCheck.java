import java.util.Scanner;

public class PerfectNoCheck {

    public static boolean perfect(int n){
        int originalNo = n;
        int sum = 0;

        for (int i = 1; i<n; i++){
            if (n%i == 0){
                sum+=i;
            }
        }

        return sum==originalNo;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to check perfect or not:");
        int n = input.nextInt();


        for (int i = 1; i <= 1000; i++) {
            if (perfect(i)){
                System.out.println(i);
            }
        }

    }
}
