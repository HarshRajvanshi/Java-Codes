package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while(true){
            System.out.println("enter number");
            int num =input.nextInt();
            if(num!=0){
                isPrime(num);
            }
            else{
                break;
            }

        }

    }

    private static void isPrime(int n) {
        int flag=1;
        int x=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0){
                flag=0;
                x=i;
                break;
                      }
        }
        if(flag==1) {
            System.out.println("Prime");
        }
        else{
            System.out.println("not prime and is divisible by"+x);
        }
    }
}
