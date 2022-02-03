package com.company;
import java.util.*;
public class MultidimensionalArray {
    public static void main(String[] args) {
        System.out.println("enter the size of 2d array");
        Scanner input=new Scanner(System.in);
        int arr[][]=new int[3][];
        for(int row=0;row<arr.length;row++){
            System.out.println("enter the size of this row");
            int x=input.nextInt();
            for(int col=0;col<x;col++){
                System.out.print("enter ");
                arr[row][col]= input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
