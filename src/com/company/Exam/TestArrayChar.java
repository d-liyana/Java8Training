package com.company.Exam;

public class TestArrayChar {
    public static void main(String[] args) {
        char[] chars = "demoscomtesttest".toCharArray();

        // Count the occurrences of each letter
        int[] counts = countLetters(chars);

        System.out.println("The occurrences of each letter are:" );
        System.out.println('a');
        displayCounts(counts);//from   w  w w .j a va  2  s.c  o  m
    }
    /** Count the occurrences of each letter */
    public static int[] countLetters(char[] chars) {
        // Declare and create an array of 26 int
        int[] counts = new int[26];

        // For each lowercase letter in the array, count it
        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;

        return counts;
    }

    /** Display counts */
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] > 0) {
                System.out.println((char) i);
                System.out.println((char)(i + 'a') +" " + counts[i] );
            }
        }
    }

}

