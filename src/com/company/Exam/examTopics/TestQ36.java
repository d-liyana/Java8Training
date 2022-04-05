package com.company.Exam.examTopics;

public class TestQ36 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Duke");
        String s= sb.toString();
        String s2=s;

        //To print True
        System.out.println(s==s2);
        System.out.println(s.equals(s2));
    }
}
