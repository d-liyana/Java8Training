package com.company.Exam.examTopics.q72;

public class TestQ72 {
    public static void method1(){
        try {
            throw Math.random()>0.5?new MyException():new RuntimeException();
        }catch (RuntimeException re){
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        try {
            method1();
        }catch (MyException me){
            System.out.println("A");
        }
    }
}

//Outputs B Because MyException is under RuntimeException. So it caught as runtimeException