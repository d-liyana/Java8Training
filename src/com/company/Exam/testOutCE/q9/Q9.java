package com.company.Exam.testOutCE.q9;

interface I{
    public void displayI();
}

abstract class C2 implements I{
    public void displayC2(){
        System.out.println("C2");
    }
}
public class Q9 extends C2 {
    public void displayI(){
        System.out.println("C1");
    }

    public static void main(String[] args) {
        C2 obj=new Q9();
        I ojI=new Q9();

        C2 s=(C2) ojI;
        I t=obj;

        t.displayI();
        s.displayC2();


    }
}
