package com.company;
import java.util.Scanner;
public class OccurrencesInt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int num=input.nextInt();
        System.out.println("enter character to be found");
        int find=input.nextInt();
        int count=0;
        int rem=0;
        while(num>0)
        {
            rem=num%10;
            if(rem==find){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
