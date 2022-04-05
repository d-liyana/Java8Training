package com.company.Exam.testOutCE;

public class Q43 {
    public static void main(String[] args) {
        int x = 10;
        int y = ++x;//11
        int z = 0;
        System.out.println(y+" "+x);
        if (y >= 10 || y <=++x) {
            System.out.println(y+" "+x);
            System.out.println(z);
            z = x;//12
        }  else {
            z = x++;
        }
        System.out.println(z);

    }
}
