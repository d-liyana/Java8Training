package com.company.Exam.testQuestions;

public class TestJava2sQ9 {

    public static void main(String[] args) {
        int val=0;
        int x=3;

        while (val++<3){
            System.out.println("val "+val);
            int y=(1+2*val)%3;
            System.out.println("y "+y);
            switch (y){
                default:
                case 0:
                    x-=1;
                    System.out.println("Am in 0");
                    System.out.println("Am in "+x);

                    break;
                case 1:
                    x+=5;
            }
        }
        System.out.println(x);
    }
}
