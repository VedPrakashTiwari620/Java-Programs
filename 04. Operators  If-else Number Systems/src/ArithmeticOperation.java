import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
       Scanner imput = new Scanner(System.in);

        int a= imput.nextInt();
        int b= imput.nextInt();



//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);


        System.out.println(a/b+a-b*a%b);


        float c=4.52f;
        float d=5.47f;

        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c%d);

    }
}
