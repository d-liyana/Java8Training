package com.company.Exam.examTopics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestQ35 {

    public static void main(String[] args) {
        LocalDate date1=LocalDate.now();
        LocalDate date2=LocalDate.of(2014,06,20);
        LocalDate date3=LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);

        System.out.println("Today  : "+date1);
        System.out.println("Date 2 : "+date2);
        System.out.println("Date 3 : "+date3);

    }
}
