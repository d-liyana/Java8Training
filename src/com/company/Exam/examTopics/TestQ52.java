package com.company.Exam.examTopics;

public class TestQ52 {
    public static void main(String[] args) {
        String[] str=new String[2];
        int idx=0;

        for (String s:str){
            str[idx].concat(" element "+idx);
            idx++;
        }
        for (idx=0;idx< str.length;idx++){
            System.out.println(str[idx]);
        }

    }
}

//Outputs        Exception in thread "main" java.lang.NullPointerException
//	at com.company.Exam.examTopics.TestQ52.main(TestQ52.java:9)
