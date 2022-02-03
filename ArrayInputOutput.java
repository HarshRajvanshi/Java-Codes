package com.company;

import java.util.Arrays;

public class ArrayInputOutput {
    public static void main(String[] args) {
        int n = 5;
        float arr[]=new float[n];
        System.out.println(arr[1]+"\tdefault value of float array when no value is put");


        String ar[]=new String[n];
        System.out.println(ar[1]+"\tdefault value of String array when no value is put");

        int axy[]={5,5,6,2,1,7,9,5,2};
        for(int num:axy){         //for each loop
            System.out.print((num+1)+" ");   //added 1 to each element in array axy
        }


        System.out.println();  //empty line
        System.out.println(Arrays.toString(axy));    //easiest way to print the array by converting them to string



    }
}
