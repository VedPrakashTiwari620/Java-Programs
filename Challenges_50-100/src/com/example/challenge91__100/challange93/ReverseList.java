/**
 * Create a program that reverse the elements of a list and prints the reversed list.
 */
package com.example.challenge91__100.challange93;

import java.util.*;




public class ReverseList {

    public static <E> void print(Collection<E> list){
        for (E e : list) {
            System.out.print(e+" ");
        }
    }



    public static  void reverse(ArrayList list){

        int i = 0;
        int j = list.size()-1;

        while (i<j){
            int temp=(int) list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

//        SwapTwoElementInArrayList.swap();


    }

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Collections.addAll(numList,1,2,3,4,5,6);

//        Collections.reverse(numList);

        System.out.println(numList);

        reverse(numList);

        print(numList);


    }


}
