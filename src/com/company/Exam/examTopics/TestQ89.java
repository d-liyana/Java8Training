package com.company.Exam.examTopics;

public class TestQ89 {
    public static void main(String[] args) {
        String stuff="TV";
        String res="";

        res=stuff.equals ("TV") ?  "Walter" : stuff.equals ("Movie") ? "White" : "No Result";
        System.out.println(res);
    }
}
