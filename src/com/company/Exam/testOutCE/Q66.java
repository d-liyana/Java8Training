package com.company.Exam.testOutCE;

public class Q66 {
    static int count;
    public static void displayMsg ( ) {
        System.out.println("Welcome Visit Count: " + count++);       // line n1
    }
    public static void main(String[] args) {
        Q66.displayMsg();
        displayMsg ();      // line n2
    }
}
