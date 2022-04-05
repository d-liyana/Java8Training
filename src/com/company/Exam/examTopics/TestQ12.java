package com.company.Exam.examTopics;

public class TestQ12 {
    public static void main(String[] args) {
        String ta="A";
        ta=ta.concat("B");
        String tb="C";
        ta=ta.concat(tb);
        //If ta initialize as follows it prints "ABCD" but in question it's not equal to "ta"
        //ta=ta.replace('C','D');
        ta.replace('C','D');
        ta=ta.concat(tb);
        System.out.println(ta);
    }
}
