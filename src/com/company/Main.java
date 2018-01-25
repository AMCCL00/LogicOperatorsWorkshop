package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 2;
        int b = 4;
        int x = 6;
        int y = 1;

        System.out.println("a = 2");
        System.out.println("b = 4");
        System.out.println("x = 6");
        System.out.println("y = 1");

        if(a == x && y + y == a){
            System.out.println("a == x && y + y == a");

            /* && - and - Both conditions Have to be true for this to return true
               || - or  - Only one condition has to be true for this to return true
               !  - not - It is not equal to a variable or condition
               == - equal to - Validates a condition
             */
        }
        if (y + y == a || a == x){
            System.out.println("y + y == a || a == x");
        }
        if (!(a == x) && y + y == a){
            System.out.println("!(a == x) && y + y == a");
        }
        if (a < b){
            System.out.println("a < b");
        }
    }
}
