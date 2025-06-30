public class TypeConversion {
    public static void main(String[] args) {
//        implicit
        float myFloat=5;
        float eFloat=45;
        double eDouble=3.4f;
//        myFloat=5.7;


//        explicit

        float num  =(float) 4.4;
        long ebig = (long) 3.4;
        int eInt = (int) 3.4;

        System.out.println(myFloat);
        System.out.println(eFloat);
        System.out.println(eDouble);
        System.out.println(num);
        System.out.println(ebig);
        System.out.println(eInt);


    }
}
