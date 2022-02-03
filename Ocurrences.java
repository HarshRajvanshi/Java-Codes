package com.company;
import java.util.Scanner;
public class Ocurrences {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string & double enter after that");
        String str=input.nextLine();
        input.nextLine();
        System.out.println("enter the character you need to find occurrence of ");
        char ch = input.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                  count++;
            }
        }
        System.out.println(count);
    }
}
