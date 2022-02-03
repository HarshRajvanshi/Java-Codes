package com.company;
import java.util.*;
public class Search2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[in.nextInt()][in.nextInt()];
        int min = Integer.MAX_VALUE;
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter");
                arr[i][j] = in.nextInt();
                if (arr[i][j] < min) {
                    min = arr[i][j];
                } else if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
//        System.out.println();
        int target = 5;
        System.out.println(check(arr, target));
        System.out.println(min+" minimum");
        System.out.println(max+" maximum");
    }

    private static boolean check(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
