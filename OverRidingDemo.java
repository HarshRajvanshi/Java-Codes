package com.company;

class Parent{
    Parent(){
        System.out.println("it is Parent constructor");
    }
    void method1(){
        System.out.println("it is a method of Parent class");
    }

}

class Child extends Parent{
     //this class has no constructor and when we use NEW keyword, it will invoke the parent class constructor
    @Override    //decorator
    void method1(){         //Overridden method
        System.out.println("it is a method of child class ");
    }
}
public class OverRidingDemo {
    public static void main(String[] args) {
	        Parent papa=new Parent();
            papa.method1();

            Child beta=new Child();     //it will invoke the constructor of parent class
            beta.method1();    //over ridden method

    }
}
