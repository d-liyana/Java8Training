package com.company.Exam.examTopics;

public class TestQ10 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(5);
        StringBuilder sb1=new StringBuilder("5");
        StringBuilder sb2=new StringBuilder("5");

        String s="";
        String s2;

        System.out.println(sb);
        if (sb.equals(s)){
            System.out.println("March 1");
        }else if (sb.toString().equals(s)){
            System.out.println("March 2");
        }else {
            System.out.println("March 3");
        }

        if (sb.equals(sb2)){
            System.out.println("True");
        }else if(sb2==sb1){
            System.out.println("Second True");
        }else if (sb2.toString().equals(sb1.toString())){
            System.out.println("Third True");
        }

        //Can't do as follows since s2 is not initialize
      /*  if (sb.equals(s2)){
        }*/
    }
}
