import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter the number");
//        int a = input.nextInt();
//        System.out.print("Enter the 2nd number");
//        int b = input.nextInt();
////        int ans=1;
////        for (int i=1; i<=b; i++){
////            ans*=a;
////        }
////        System.out.println(ans);
////        System.out.println(Math.pow(a,b));
////    }
//
//       /* System.out.println("Whole sq of a+b=");
//        int whole = (a * a) + 2 * (a * b) + (b * b);
//        System.out.println(whole);
//
//        */
//        int sum=0;
//    int i;
//    for(i=1;i<=b;i++){
//        if (i%2==1){
//            sum+=i;
//        }else{
//            sum-=i;
//        }
//    }
//        System.out.println(sum);
//    }

    /*
    infinite
    1
    83
    9832
    98423
    9329
    -1
    8'
    9
    9
    0
    Write a program that takes input for infinite time.
    Add all the numbers if the number is positive. if the number is less than 0 clear the sum.
    If the input is 0 then output the sum.
     */

        System.out.println("Enter the number");
        int sum=0;

        while (true){

            int a = input.nextInt();

            if(a>0){
                sum+=a;
            } else if (a==0) {
                System.out.println(sum);
                break;

            }
            else if (a==-1){
                sum=0;

            }
        }

        }





}
