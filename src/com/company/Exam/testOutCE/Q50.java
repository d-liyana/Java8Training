package com.company.Exam.testOutCE;

public class Q50 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2[] = {"J", "a", "v", "a"};
        String str3 = " ";
        for (String str : str2) {
            str3= str3+str;
        }
        System.out.println(str1);
        System.out.println(str3);
        str3=str3.trim();
        boolean b1 = (str1.equals(str3));
        boolean b2 = (str1 == str3);
        System.out.print (b1+", "+b2);
        System.out.println(str3);
    }
}
