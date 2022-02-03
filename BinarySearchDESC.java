package com.company;
import java.util.*;
//find index when sorting is in descending
public class BinarySearchDESC {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter count");
        int[] arr=new int[input.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter ");
            arr[i]=input.nextInt();
        }
        System.out.println("enter target");
        int target=input.nextInt();
        System.out.println(check(arr,target));


    }
    static int check(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        //descending
        if(arr[start]>arr[end]) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;   //if target not found
        }


        //ascending
        else{
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;

        }

    }
}
