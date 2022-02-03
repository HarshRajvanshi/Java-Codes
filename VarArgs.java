package com.company;
import java.util.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        abc(3,4,5,6,7,7,8,9,9);    //called function with random int inputs
        multiple(1,2,"harsh","rajvanshi");

    }
    public static void multiple(int a,int b , String...v){ //will take definite input and unknown as well
        System.out.println(a+"\n"+b);
        System.out.println(Arrays.toString(v));

    }


    public static void abc (int...v){    //used when number of input in unclear
        System.out.println(Arrays.toString(v));   //displays array without needing the for loop
    }
}
