package com.company.Exam.examTopics;

public class TestQ55 {
    public static void main(String[] args) {
        int ival=100;
        float fval=100.0f;
        double dval=100.0;

      //  ival=fval; because of numeric promotion
        fval=ival;
        dval=fval;
      //  fval=dval;
        dval=ival;
      //  ival=dval;

    }
}
