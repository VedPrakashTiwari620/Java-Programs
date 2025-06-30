package com.example.challenges51__76;

class Course {

    String courseName;
    String enrolledStudents;
    int enroll;
    static int maxCapacity;
    String enrollments[];

    Course(String courseName){
        this.courseName=courseName;
        this.enroll=0;
        enrollments=new String[maxCapacity];
    }

    void enrollStudent(String studentName){
        if(enroll<=maxCapacity){
            enrollments[enroll]=studentName;
            enroll++;
        }
    }

    void unenrollStudent(String studentName){
        if (enroll>0){
            enrollments[enroll]=null;
            enroll--;
        }
    }




    static void setMaxCapacity(int capacity){
        maxCapacity=capacity;
    }


    public static void main(String[] args) {

        Course.setMaxCapacity(3);
        System.out.println(Course.maxCapacity);
        Course c1= new Course("Java Fundamentals");
        c1.enrollStudent("Ved Prakash Tiwari");

        
    }
}
