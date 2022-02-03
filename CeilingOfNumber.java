package com.company;
//finding the greatest minimum number to our target
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,9,10};
        int target=7;
        System.out.println(ceiling(arr,target));
    }

    static int ceiling(int[] arr,int target){
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
        return arr[high+1];
    }
}
