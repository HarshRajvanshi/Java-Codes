package com.company;
import java.util.*;
public class Overloading {
    public static void main(String[] args) {
        one("harsh");
        one(1);
        one(1,2,3,4,5,6,6,8);

    }

    public static void one(int...v){   //overloading wth varargs
        System.out.println(Arrays.toString(v)+"varargs");
    }


    public static void one(String n) {
        System.out.println("this one is a string method of same name   :first one="+n);

    }
    public static void one(int a) {
        System.out.println("this one is a int method of same name  :second one="+a);
    }
}
