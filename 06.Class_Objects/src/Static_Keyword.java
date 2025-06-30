class Student{
    static char section;
    static String course;

    public static void details(String name, int roll){
        System.out.println("Student Name is "+name+"Roll no: "+roll+" Section "+section+" Course "+course);
    }
}
public class Static_Keyword {
    public static void main(String[] args) {
        Student.section='C';
        Student.course="MCA";

//        Student s1 = new Student();
        Student.details("Ved Prakash Tiwari",216);

    }
}
