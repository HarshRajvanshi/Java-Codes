package com.company;
import java.util.*;
public class SearchinRange {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=in.nextInt();
        int[] arr=new int[n];
         for(int i=0;i<n;i++){
             System.out.println("enter ");
             arr[i]=in.nextInt();
         }
        System.out.println("upper bound");
        int up=in.nextInt();
        System.out.println("lower bound");
        int low =in.nextInt();
        System.out.println("target");
        int target=in.nextInt();
        System.out.println(search(arr,up,low,target));
    }

    private static boolean search(int[] arr, int up, int low, int target) {
        for (int i = up; i <=low; i++) {
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
