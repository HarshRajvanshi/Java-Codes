package com.company;
import java.util.*;
public class PrimeWithWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //a=7;
        while(true){
            System.out.println("enter number");
            int num =input.nextInt();
            if(num!=0 || num!=1){
                System.out.println(isPrime(num));
            }
            else{
                break;
            }

        }

    }

    public static boolean isPrime(int a) {
        int c=2;
        while(c*c<=a){
            if(a%c==0){
                return false;
            }c++;

        }
        return true;



    }
}
