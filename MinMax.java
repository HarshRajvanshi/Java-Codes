package com.company;
import java.util.*;
public class MinMax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[10];
        int min=1;
        int max=1;
        for(int i=0;i<10;i++){
            System.out.print("enter ");
            arr[i]=in.nextInt();
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(min+" is the minumum \n"+max+" is the maximum");
    }
}
