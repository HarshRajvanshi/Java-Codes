package com.company;

public class MethodOverloading {
    static void a(){
        System.out.println("method a overloading ");
    }
    static void a(int a){
        System.out.println("method a with overloading "+a);
    }
    public static void main(String[] args) {
	// write your code here
        int a=10;
        a();
        a(10);
    }
}
