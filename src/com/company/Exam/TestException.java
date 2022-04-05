package com.company.Exam;

public class TestException {
    public static void main(String[] args) {

        String s=new String("abc");

     System.out.print("a");
     try {
        System.out.print("b");
        throw new IllegalArgumentException();
    } catch (RuntimeException e) {
        System.out.print("c");
    } finally {
        System.out.print("d");
    }
     System.out.print("e");
}
}
