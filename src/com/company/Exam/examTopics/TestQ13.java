package com.company.Exam.examTopics;

class TestQ13 {
    int r;

    public TestQ13(int r) {
        this.r = r;
    }
}

class DVD extends TestQ13{
    int c;

    public DVD(int r, int c) {
      //answer
        super(r);
        this.c = c;
    }
}
