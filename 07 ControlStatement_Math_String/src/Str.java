import java.security.SecureRandom;

public class Str {
    public static void main(String[] args) {
        String name="Ved";
        String name2="Ved";
//        String name2="VedP";
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name2==name);
//        System.out.println(name2==name);


        String name3 = new String("VedP");
        System.out.println(name==name3);
        System.out.println(name.equalsIgnoreCase("vEd"));



        String name4=name3+" Prakash Tiwari";
        System.out.println(name4);

        System.out.println(name4.length());
        System.out.println(name.substring(0,3));
        System.out.println(name.indexOf("d"));
        System.out.println(name.compareToIgnoreCase("ved"));
    }
}
