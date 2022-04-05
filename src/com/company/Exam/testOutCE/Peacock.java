package com.company.Exam.testOutCE;

public class Peacock extends Bird{
    public void dance(){
        System.out.println("Dance");
    }
    public static void main(String[] args) {
        Bird b=new Peacock();
        Peacock p=(Peacock) b;

        p.dance();
        p.fly();

    }
}
