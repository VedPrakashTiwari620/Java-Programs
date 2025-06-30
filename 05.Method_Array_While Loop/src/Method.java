class Methods{

    public int getRandm(int a, int b){
        return (int) (Math.random()*(b-a+1)+a);
    }

}

public class Method {
    int age;
    public static void main(String[] args) {
        Methods met=new Methods();
        met.getRandm(10,30);

        double a=3.43;
        int b=4, c=5, d=7;
        System.out.println(Math.sqrt(b));
        System.out.println(Math.floor(a));
        System.out.println(Math.ceil(a));

        System.out.println(Math.pow(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.sqrt(b));
        System.out.println(getRandon(20,22));

    }
    public static int getRandon(int a, int b){
        return (int) (Math.random()*(b-a+1)+a);
    }
}
