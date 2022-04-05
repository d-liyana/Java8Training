package com.company.Exam;

public class TestLoop {
    public static void main(String[] args) {
        int a = 1;
        while (a == a++) {
           System.out.println("first"+a);
            a++;
            System.out.println(a);
        }
    }
}

