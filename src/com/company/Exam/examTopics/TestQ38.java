package com.company.Exam.examTopics;

public class TestQ38 {
    public static void main(String[] args) {
        double discount=0;
        int quantity=Integer.parseInt(args[0]);
/*
        if (quantity > 90) {
            discount=0.5;
        }

        if (quantity > 80 && quantity <90){
            discount=0.2;
        }*/

        discount=(quantity>=90) ? 0.5 : (quantity>80) ? 0.2 :0;

        System.out.println("Discount : "+discount);
    }
}
