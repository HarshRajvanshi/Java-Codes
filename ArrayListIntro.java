package com.company;
import java.util.ArrayList;
public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);      //adding the elements in list is like python
        list.add(5);
        System.out.println(list + " before updation");    //no need to enter deepTOString, just the name is enough


        list.set(3,4);             //setting the element at 3index as 4    (index,new-element)
        System.out.println(list+" after updation");


        System.out.println(list.contains(5));     //return true/false
        System.out.println(list.contains(list.remove(4)));   //deleted the 4th index and checked whether it is present or not

    }
}
