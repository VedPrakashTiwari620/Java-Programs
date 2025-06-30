package com.kgCoding.CollectionQueue;

import java.util.Collection;
import java.util.LinkedList;

public class CollectionQueue {

    public static <E> void print(Collection<E> collection){
        for (E str : collection) {
            System.out.printf("%s ",str);
        }
    }

    public static void printt(Collection collection){
        for (Object str : collection) {
            System.out.printf("%s ",str);
        }
    }

    public static void printtt(LinkedList linkedList){
        for (Object str : linkedList){
            System.out.print(str);
        }
    }




    public static void main(String[] args) {

//        List<String> linkList = new LinkedList<String>();


        LinkedList<String> linkList = new LinkedList<>();

        linkList.add("Ved");
        linkList.add("Prakash");
        linkList.offer("Tiwari");

//        for (String s : linkList) {
//            System.out.print(s+" ");
//        }

//        for (int i = 0; i < linkList.size(); i++) {
//            linkList.poll();
//        }

//        linkList.remove();

        System.out.println(linkList.element());
        System.out.println(linkList.peek());

        System.out.println(linkList.remove());
        System.out.println(linkList.poll());


        System.out.println(linkList.remove());
        System.out.println(linkList.poll());

//        System.out.println(linkList.remove());

        System.out.println(linkList.poll());

        print(linkList);

        printt(linkList);






        linkList.add("Ved");
        linkList.add("Prakash");
        linkList.offer("Tiwari");

        printtt(linkList);


//        linkList.clear();

        while (!(linkList.isEmpty())){
            System.out.println("Removed "+linkList.poll());
        }

        printtt(linkList);

        linkList.clear();
    }
}
