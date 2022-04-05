package com.company.Exam;

public class TestString2 {
    public static void main(String[] args) {
        byte ascii[] = {65, 66, 67, 68, 69, 70 };

        String s1 = new String(ascii);
        System.out.println(s1);  //  w w w .j  a  v  a2s .  co m

        String s2 = new String(ascii, 2, 3);
        System.out.println(s2);
    }
}
