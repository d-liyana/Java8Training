package com.company.Exam;

public class TestSpringBuider {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder(10+2+"ABC"+4+5);
        sb.delete(3,6);
        sb.append(3);
        sb.append(sb.delete(1,4));
        System.out.println(sb);
    }
}
