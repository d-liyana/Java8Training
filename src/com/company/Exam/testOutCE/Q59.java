package com.company.Exam.testOutCE;

public class Q59 {
    public static final int MIN = 1;
    public static void main(String[] args) {
        int x = args.length;
        if (checklimit(x)) {    //  line n1
            System.out.println("Java SE");
        } else {
            System.out.println("Java EE");
        }
    }
        public static boolean checklimit (int x)  {
            return (x >= MIN) ? true : false;
        }
    }


