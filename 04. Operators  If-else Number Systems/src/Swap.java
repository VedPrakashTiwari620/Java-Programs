class Swap {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int c;

        System.out.println("Before swaping");
        System.out.println(a);
        System.out.println(b);

//        c=a;
//        a=b;
//        b=c;


//        System.out.println("After swaping using 3rd Variable");
//        System.out.println(a);
//        System.out.println(b);



        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("After swaping without 3rd variable");
        System.out.println(a);
        System.out.println(b);

    }
}

