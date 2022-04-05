package com.company.Exam;

public class TestForLoop {
    public static void main(String[] args) {
        int i;
        int j;
        for (i=1; i < 4; i++) {
            System.out.println("in I " +i);
            for (j=2; j < 4; j++) {
                System.out.println("in J "+j);
                if (j == 3) {
                    System.out.println("within IF "+j);
                    continue;
                }
                System.out.println("Result i: " + i + " j: " + j);
            }
        }

    }
}
