package com.company;
import java.util.*;
public class CountDigits {
    static int Count(int  num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int num=in.nextInt();
        System.out.println(Count(num));
    }
}
