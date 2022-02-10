package com.company;

public class OperatorsPrecedence {
    public static void main(String[] args) {
        /*
        in java operators have precedence over another operator
             --> "*" & "/" & "%"  have same precedence i.e. 12 (when in same line then left to right is followed)
             --> "-" & "+" have same precedence i.e. 11 (left to right)
             -->

         */
        int a=60/2-30*6;

        /*
                   =30-30*6
                   =30-180
                   =-150
         */
        int b=60*2-30/6;
        /*
                 =120-30/6
                 =120-5
                 =115
         */

        System.out.println(a);
        System.out.println(b);


    }
}
