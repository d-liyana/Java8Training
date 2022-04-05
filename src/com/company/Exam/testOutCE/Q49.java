package com.company.Exam.testOutCE;

public class Q49 {
  /*  public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        for (int i = 0; i < arr.length; i++) {
                System.out.print (arr[i] + " ");
                if (arr[i].equals("B")) {
                    continue;
                }
            continue;

        }
        }*/

    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print (arr[i][j] + " ");
                if (arr[i][j].equals("B")) {
                    continue;
                }
            }
            continue;
        }

    }
}
