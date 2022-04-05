package com.company.Exam.java2s;

public class TQ9 {


    public static void main(String[] args) {
        int myVal=0;
        int x=3;
        System.out.println();
        System.out.println("mv is "+myVal);

        while (myVal++<3){

            System.out.println("--------------------");
            System.out.println("mv is "+myVal);

            int y=(1+2*myVal)%3;
            int b=(1+2*myVal);
            System.out.println("B is "+b);
            System.out.println("Y is "+y);
            System.out.println("X is "+x);
            System.out.println(myVal+" MyVal2");
            System.out.println("#############");
            System.out.println();

            switch (y){
                default:
                    System.out.println("Default");
                case 0:
                    x-=1;
                    System.out.println("within case "+x);
                    break;
                case 1:
                    x+=5;
            }
        }
        System.out.println(x);
    }
}
