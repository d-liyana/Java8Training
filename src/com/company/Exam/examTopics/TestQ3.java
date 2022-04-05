package com.company.Exam.examTopics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestQ3 {
    public static void main(String[] args) {
       // String date= LocalDate.parse("2014-04-01").toString().format(String.valueOf(DateTimeFormatter.ISO_DATE));
        //String date= LocalDate.parse("2014-04-01").format((DateTimeFormatter.ISO_DATE));
        LocalDate date1= LocalDate.of(2015,9,12);

        System.out.println(date1);
    }
}
