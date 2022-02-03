package com.company;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter limit for fibonacci");
        int n=in.nextInt();
        int a=0;
        int b=1;
        int z=0;
        //System.out.println(a);
        //System.out.println(b);
        for(int i=1;i<n;i++)
        {
            z+=a+b;
            a=b;
            b=z;
            z=0;
        }
        System.out.printf("fibonnacci number %d in the sequence is %d ",n,b);
    }
}
