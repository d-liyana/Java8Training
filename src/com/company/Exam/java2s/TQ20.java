package com.company.Exam.java2s;

public class TQ20 {
    private String color;
       public TQ20() {
             this("white");
           }
        public TQ20(String color) {
            color = color;
           }
        public static void main(String[] args) {
            TQ20 e = new TQ20();
            System.out.println("Color:" + e.color);
           }
}
