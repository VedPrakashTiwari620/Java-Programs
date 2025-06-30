public class NoOfStairs {

    static int noOfClimbs(int n){
        if (n==1 || n==2) return n;
        return noOfClimbs(n-1) + noOfClimbs(n-2);
    }

    public static void main(String[] args) {
        //Find how many ways to climb if climb atleast 1 or 2 at a time

        int noOfStairs = 3;

        System.out.println("No of Ways :"+ noOfClimbs(noOfStairs));
    }
}
