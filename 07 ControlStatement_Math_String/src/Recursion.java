public class Recursion {


//    static int factorial(int num){
//
//        if (num==1){
//            return 1;
//        }
//
//        return num*factorial(num-1);
//    }




//    static int reverseDigit(int num){
//        int digit;
//        int newNum=0;
//        while(num>0){
//            digit=num%10;
//            num/=10;
//            newNum=newNum*10+digit;
//        }
//        return newNum;
//    }

    static int sumOfDigit(int num){
        int sum=0;
        int digit;
        while (num>0){
            digit=num%10;
            num/=10;
            sum+=digit;
        }
        return sum;
    }



    public static void main(String[] args) {

//        int fact=factorial(5);
//        System.out.println(fact);


//        int rdigit=reverseDigit(123);
//        System.out.println(rdigit);

        int sumDig=sumOfDigit(123);
        System.out.println(sumDig);

//        int rev= reverseDigit(123);
//        System.out.println(rev);
    }
}
