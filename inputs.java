package com.company;
import java.net.SocketOption;
import java.util.Scanner;
public class inputs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string");
        String chara=input.nextLine();
        //System.out.println(chara);


        System.out.println("enter a number 1");
        int num1=input.nextInt();
        System.out.println("enter a number 2");
        int num2=input.nextInt();
        System.out.println(num1+num2+" , "+chara+" ,added integers and concatanated the string with it");

        int n=(int)54.32;   //typecasting
        System.out.println("typcasting float into integer"+n);


        int m=257;
        byte by=(byte)(m);
        System.out.println("typcasted int(257) into byte which me a result of = "+by+", coz byte has the limit of 256 and we gave 257");


        System.out.println("we ll convert celsius into fahrenheit");
        System.out.println("enter celsius");
        float celsius= input.nextFloat();
        float f=celsius*9/5+32;
        System.out.println((int)(f));


    }
}
