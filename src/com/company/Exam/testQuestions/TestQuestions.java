package com.company.Exam.testQuestions;

public class TestQuestions {
    String courseName;
    TestQuestions(){
       // TestQuestions tq=new TestQuestions();
        this.courseName="java";
    }
}

class Main{
    public static void main(String[] args) {
        TestQuestions t=new TestQuestions();
       // t.courseName="oracle";
        System.out.println(t.courseName);
    }
}
