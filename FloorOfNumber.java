package com.company;
import java.util.Scanner;
public class FloorOfNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={11,22,33,44,55,66,77,88,99};
        System.out.println("target ");
        int target=in.nextInt();
        System.out.println(floor(arr,target));


    }
    static int floor(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return arr[high];
    }
}


