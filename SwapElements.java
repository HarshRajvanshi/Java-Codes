package com.company;
import java.util.*;
public class SwapElements {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i = 0; i<5;i++){
            System.out.println("enter");
            arr[i]=input.nextInt();
        }
        System.out.print("enter index one ");
        int one=input.nextInt();
        System.out.print("enter index two ");
        int two=input.nextInt();
        System.out.println(Arrays.toString(arr));
        Swap(arr,one,two);

    }

    public static void Swap(int[] arr,int one,int two){
        arr[one]=arr[one]^arr[two];
        arr[two]=arr[one]^arr[two];
        arr[one]=arr[one]^arr[two];
//        Sys?tem.out.println(one+" "+two);
        System.out.println(Arrays.toString(arr));


    }
}
