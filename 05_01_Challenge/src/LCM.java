import java.util.Scanner;

public class LCM {

    public static int lcm(int first, int second){
        int i=1;
        while (true){
            int factor=first*i;
            if (factor%second==0){
                return factor;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to LCM");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your numbers");
        int first= input.nextInt();
        System.out.println("Enter your numbers");
        int second= input.nextInt();


        int lcm=lcm(first,second);
        System.out.println("LCM of "+first+", "+second+" is"+lcm);
    }
}
