package com.company.Exam.testOutCE.tq5;


import java.io.IOException;

public class Q5 {
    public static void main(String[] args) {
       try {
           method1();
       }catch (MyException o){
           System.out.println("My");
       }
    }

    public static void method1(){
        try {
            throw 3>10 ?new MyException(): new IOException();
        }catch (IOException io){
            System.out.println("IO");
        }catch (Exception e){
            System.out.println("E");
        }
    }
}
