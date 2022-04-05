package com.company.Exam.vceGuide;

public class Q4 {
    public static void main(String[] args) {
        int n[][]={{1,3},{2,4}};
        for (int i=n.length-1;i>=0;i--){
            for (int j=n[i].length-1;j>=0;j--){
                System.out.println(n[i][j]);
            }

        }
    }
}


class QQ{
    public static void main(String[] args) {
        int a[][]={{2,3},{7,9}};
        for (int y= a.length-1;0<=y;y--) {
            for (int b[] : a) {
                System.out.println(b[y]);
            }
        }
    }
}
