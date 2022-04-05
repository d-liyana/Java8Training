package com.company.Exam.testQuestions;

public class Calculator {
    public static void main(String[] args) {
    String a= "Java";
    char a2[]= {'J','a','v','a'};
   // String a3="";
    String a3=null;
        for (char ab:a2){
        a3=a3+ab;
    }
        if (a.equals(a3)){
            System.out.println("success");
        }else {
            System.out.println("False");
        }
        System.out.println(a3);
    }
}
