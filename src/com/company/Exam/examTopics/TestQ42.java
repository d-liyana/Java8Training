package com.company.Exam.examTopics;

public class TestQ42 {
    public static String maskCC(String creditCardNo){
        String s="XXXX-XXXX-XXXX-";
     /*   StringBuilder sb=new StringBuilder(CreditCardNo.toString());
        sb=(sb.substring(15, 19));*/ //Since Credit card no is String we have to create new obeject StringBuilder
        //return s+sb;

       // return s+creditCardNo.substring(15,19);
//Or
        StringBuilder sb=new StringBuilder(s);
        sb.append(creditCardNo,15,19);
        return sb.toString();

        //StringBuilder sb=new StringBuilder(creditCardNo);
    }
    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9876-4563"));
    }
}
