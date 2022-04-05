package com.company.Exam.vceGuide;

import java.time.LocalDate;

public class Q3 {
    public static void main(String[] args) {
        LocalDate d= LocalDate.of(2017,1,30);
         d.plusDays(10);
        System.out.println(d);

        d= d.plusDays(10);
        System.out.println(d);

    }
}
