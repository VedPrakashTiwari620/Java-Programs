class Student {
    String name;
    int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
//                .add("age=" + age)
//                .add("name='" + name + "'")
//                .toString();
//    }


    @Override
    public String toString() {
        return "Student Details: {name:"+name
                +", age"+age+"}";
    }

    public static void main(String[] args) {
        //Define a Student class with fields name and age, and use toString to print student details.
        Student s1=new Student(21,"Ved Prakash Tiwari");

        System.out.println(s1.toString());
    }
}
