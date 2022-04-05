package com.company.Exam.examTopics;

public class TestQ4 {
    public static void main(String[] args) {
        int s7='3';

        Short s1=100;
        Integer s2=200;
        Double s5 = 240D;
       // Double s10 = "240D";
        //Double s11 = '240D';
        //Double s12 = "2D";
       //Double s13 = 240;
        Double s14 = 240.00;
        Double s15 = 240.0;

        // Integer s6 ='300';
       // Integer s9='3';
       // int s8='300';
        Long s3= (long)s1+s2;
       // String s4= (String)s1+s2;

        String s4= String.valueOf(s1+s2);
        System.out.println(s4);
        System.out.println("Sum is : "+s5);
        System.out.println("No. "+s7);// Here it's print 51. Not 3, '0' means 48 therefore 3 means 51. And we can use ''
        //0-9 only



    }
}
