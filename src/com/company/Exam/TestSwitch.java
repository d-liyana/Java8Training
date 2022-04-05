package com.company.Exam;

public class TestSwitch {
    public static void main(String[] args) {
        String a="A";
        int num = 0;
        Double no=Double.valueOf("120D");
        switch (a) {
            case "A":
                System.out.println("Capital A");

            case "a":
                System.out.println("Simple a");
            default:
                System.out.println("Default");
                System.out.println(no);

       /*     default:
                System.out.println("default");
            case 0:
                System.out.println("case1");*/

        }
    }
}
