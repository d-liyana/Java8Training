package com.company.Exam;

public class TestSubsString {
    public static void main(String[] args) {
        String s = "java2s";
        String a=new String("Dina");
        a.replace('a', 'Z').trim();
        s.concat("Aa");
       s= s.substring(1, 5);
        System.out.println(a);
        System.out.println(s);
    }
}
