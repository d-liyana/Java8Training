package com.company.Exam;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");
        /*String a ="hello";
        System.out.println(sb.equals(sb));
        System.out.println(sb.toString().equals(sb));*/

        String sb1= sb.toString();
        String sb2=sb1;
        System.out.println(sb1==sb2);
    }
}

