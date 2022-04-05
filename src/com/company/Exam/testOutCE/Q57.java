package com.company.Exam.testOutCE;

import java.time.LocalDate;

public class Q57 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of (2012, 1, 30);
        date.plusDays(10);
        System.out.println(date);
    }
}
