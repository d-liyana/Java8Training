package com.company.Exam.examTopics;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestQ115 {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.of(2014,7,31,1,1);
        dt.plusDays(10);
        System.out.println(dt);
    }
}
