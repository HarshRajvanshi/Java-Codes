package com.company;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        String str="harsh";
        char ch='r';
        System.out.println(check(str,ch));
        System.out.println(check2(str,ch));
    }
    public static boolean check(String str,char ch){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
    public static boolean check2(String str,char ch){
        for(char c : str.toCharArray()){
            if(c==ch){
                return true;
            }
        }
        return false;
    }

}
