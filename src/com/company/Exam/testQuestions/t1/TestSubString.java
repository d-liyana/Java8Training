package com.company.Exam.testQuestions.t1;

public class TestSubString {
    public static void main(String[] args) {
        String str = "This is tutorials point";
        String substr = "";

// prints the substring after index 8 till index 17
        substr = str.substring(0, 6);
        System.out.println("substring = " + substr);

// prints the substring after index 0 till index 8
        substr = str.substring(0, 8);
        System.out.println("substring = " + substr);

    }
}
