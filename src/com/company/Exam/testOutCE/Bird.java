package com.company.Exam.testOutCE;

public class Bird {
    public void fly(){
        System.out.println("Name");
    }


    public static void main(String[] args) {
        Bird b=new Peacock();
        Peacock p=(Peacock) b;

        p.fly();
        p.dance();
    }

}
