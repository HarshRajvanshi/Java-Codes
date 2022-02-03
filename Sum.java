package com.company;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while(true){
            suma();
            System.out.println("type C for continue and x for exit");
            char op=in.next().charAt(0);
            if(op!='c'){
                System.out.println("exiting");
                break;
            }
        }



    }

    static void suma(){
        Scanner input=new Scanner(System.in);
        System.out.println("a");
        long a=input.nextLong();
        System.out.println("b");
        long b=input.nextLong();
        System.out.println(a+b);
    }

}
