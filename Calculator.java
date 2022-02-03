package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("type + - * / for operations");
        char op=input.next().charAt(0);
        System.out.println("enter count of numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int result=0;

        switch (op)
        {
            case '+':
                result+=num1+num2;
                System.out.println(result);
                break;
            case '-':
                result=Math.abs(num1-num2);
                System.out.println(result);
                break;
            case '*':
                result=num1*num2;
                System.out.println(result);
                break;
            case '/':
                float x=result;

                x=(float)num1/(float)num2;
                System.out.println(x);
                break;
        }
    }
}
