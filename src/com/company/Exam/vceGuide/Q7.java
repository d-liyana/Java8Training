package com.company.Exam.vceGuide;

public class Q7 {
    int x,y;

    public Q7(int x, int y) {
      initialize(x,y);
    }

    public void initialize(int x, int y){
        this.x = x*x;
        this.y = y*y;
    }

    public static void main(String[] args) {
        int x=9,y=5;
        System.out.println(x+" "+y);

        Q7 q7=new Q7(x,y);
        System.out.println(x+" "+y);

        System.out.println(q7);
        q7.initialize(x,y);
        System.out.println(x+" "+y);
        System.out.println(q7.x+" "+q7.y);

    }
}
