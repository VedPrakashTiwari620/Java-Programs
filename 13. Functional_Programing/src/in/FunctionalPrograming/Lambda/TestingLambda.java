package in.FunctionalPrograming.Lambda;

public class TestingLambda {

    public int sum(int a, int b){
        return a+b;
    }

    public void printString(String toString){
        System.out.println(toString);
    }

    public static void main(String[] args) {

        TestingLambda test = new TestingLambda();
        int sum = test.sum(1,3);




    }
}
