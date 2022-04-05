package com.company.Exam.java2s;

public class TQFromSite {
          public static void main(String[] args) {
        //w  w w . jav  a 2s .c  o m
        int myValue = 0;
        int x = 3;
        while(myValue++ < 3) {
            System.out.println("   myValue:"+myValue);

            int y = (1 + 2 * myValue) % 3;
            System.out.println("   y:"+y);
            System.out.println("   myValue:"+myValue);
            System.out.println("   x:"+x);
            switch(y) {
                default:
                case 0: x -= 1; break;
                case 1: x += 5;
            }
        }
        System.out.println(x);
    }
}
