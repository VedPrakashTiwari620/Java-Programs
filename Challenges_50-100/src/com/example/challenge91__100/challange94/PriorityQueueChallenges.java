/**
Create a PriorityQueue of a Custom class Student with attributes name and grade.
 Use a Comparator to order by grade.


 **/
package com.example.challenge91__100.challange94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueChallenges {



    public static void main(String[] args) {
//        PriorityQueue<Object> queueSt = new PriorityQueue<>();


        PriorityQueue<Student> queueSt = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        queueSt.offer(new Student("Shyam",'C'));
        queueSt.offer(new Student("Prakash", 'B'));
        queueSt.offer(new Student("Ved Prakash", 'A'));
        queueSt.offer(new Student("Ram",'A'));
        queueSt.offer(new Student("Shyam",'C'));
        System.out.println(queueSt);

        System.out.printf("Queue got %s\n",queueSt.poll());
        System.out.printf("Queue got %s\n",queueSt.poll());
        System.out.printf("Queue got %s\n",queueSt.poll());
        System.out.printf("Queue got %s\n",queueSt.poll());
        System.out.printf("Queue got %s\n",queueSt.poll());
        System.out.printf("Queue got %s\n",queueSt.poll());

    }




    private static class Student{

        private final String name;

        private final char grade;

        public Student(String name, char grade){
            this.name=name;
            this.grade=grade;
        }

        public String getName(){
            return name;
        }

        public char getGrade(){
            return grade;
        }


        @Override
        public String toString(){
            return  name+" "+grade;
        }
//        public void setGrade(char grade){
//            this.grade=grade;
//        }
    }
}
