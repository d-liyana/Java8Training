package com.company.Exam.examTopics;

public class TestQ71 {
    public static void main(String[] args) {
        Boolean[] booleans = new Boolean[2];

        booleans[0]=new Boolean(Boolean.parseBoolean("true"));
        booleans[1]=new Boolean(null);

        System.out.println(booleans[0]+" "+booleans[1]);

    }
}
//Outputs true false;