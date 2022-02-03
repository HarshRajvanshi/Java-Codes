package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
       int a=0;
        for(int i=1;i<10;i++)
        {
            a+=i;

        }
        System.out.println(a);



        Scanner input=new Scanner(System.in);
        System.out.println("enter limit");
        int limit=input.nextInt();
        if(limit!=0){
            do{
                System.out.println("printing while loop "+limit);
                limit++;
            }
            while(limit<10);

        }
        else{
            System.out.println("none");
        }


        System.out.println("enter x and y and z for maximum determination");
         int x=input.nextInt();
         int y=input.nextInt();
         int z=input.nextInt();
         int max=Math.max(x,y);
        System.out.println(Math.max(z,max));



    }
}
