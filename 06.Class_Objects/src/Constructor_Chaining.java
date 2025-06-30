import java.util.Scanner;

class Student1{

    static int no;

    static {
        no=0;
        System.out.println("I am in static block.");
    }

    {
        no++;
        System.out.println(no);
        System.out.println("I'm in init block.");
    }




    Student1(){
        this("Ved",12);
        System.out.println("Hi this is Student name Section");
    }
    Student1(int id){
        this("Ved",id);
    }
    Student1(String name,int roll){
        System.out.println("Name :"+name);
    }


}
public class Constructor_Chaining {
    public static void main(String[] args) {

        Student1 st1=new Student1();

        Student1 st2=new Student1();

    }
}
