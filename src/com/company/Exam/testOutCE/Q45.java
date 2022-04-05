package com.company.Exam.testOutCE;

import java.util.function.Predicate;

public class Q45 {
    public static void main(String[] args) {
        Predicate<Integer> p=(n)->n%2==0;
        Boolean s = p.test(500);
        System.out.println(s);
    }
}
