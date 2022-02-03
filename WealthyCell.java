package com.company;
import java.util.Scanner;

//displaying the highest sum in multi dimensional array as wealthy cell.
public class WealthyCell {
    public static void main(String[] args) {
         //arr=new int[3][];
        int [][]arr={{1,2,3},{22,4,0},{45,2,3}};
        wealth(arr);
    }
    static void wealth(int[][]arr){
        int max=0;
        int sum=0;
        int wealthy=-1;
        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j= 0;  j<arr[i].length; j++) {
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
                sum=0;
                wealthy=i+1;
            }

        }
        System.out.println(String.format("Mr.%d has the highest wealth among all that is %d",wealthy,max));
    }
}
