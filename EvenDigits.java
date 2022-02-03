package com.company;

//checks how many digits in the array are even like {12,224,741,55}  has 5 digits even

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={12,224,741,55};
        int count=0;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            while(temp>0)
            {
                int rem=temp%10;
                if(rem%2==0)
                {
                    count++;
                }
                temp=temp/10;
            }
        }
        System.out.println(count+" is the number of total even digits");
        System.out.println(nums(arr)+" is the number of total digits in the array");

    }

    static int nums(int[]arr){
        int count=0;
        for(int i=0;i< arr.length;i++){
            int len=(arr[i]+"").length();
            count+=len;
        }
        return count;
    }
}
