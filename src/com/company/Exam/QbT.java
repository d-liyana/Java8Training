package com.company.Exam;

public class QbT {
    public static void main(String[] args) {
        String myStr = " Hello World ";
        System.out.println(myStr);
        myStr.trim();
        System.out.println(myStr);
        myStr=myStr.trim();
        System.out.println(myStr);
        int i1 = myStr.indexOf(" ");
        System.out.println(i1);
    }
}
