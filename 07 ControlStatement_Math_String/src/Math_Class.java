public class Math_Class {
    public static void main(String[] args) {
        System.out.println(Math.abs(-123));
        System.out.println(Math.ceil(12.3));
        System.out.println(Math.floor(12.3));
        System.out.println(Math.round(12.7));
        System.out.println(Math.max(12,2));
        System.out.println(Math.min(12,1));
        System.out.println(Math.pow(12,2));
        System.out.println((int)Math.sqrt(144));
        System.out.println(Math.PI);

        for (int i=0;i<10;i++){
            int random=(int) Math.round(10*((Math.random())));
            System.out.println(random);
        }


        String name="vedPrakashTiwari";
        System.out.println(name.substring(1,5));


    }
}
