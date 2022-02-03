package com.company;
import java.util.Scanner;
public class Checkcase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string");
        String str=input.next();
        char first=str.charAt(0);       //getting the first character of the string str
        if(first>='a' && first<='z')
        {
            System.out.println(first+" is a small case letter");
        }
        else{
            System.out.println(first+" is a capital letter");
        }
        //System.out.println(first);
    }
}
