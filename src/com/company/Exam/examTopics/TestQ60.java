package com.company.Exam.examTopics;

abstract class TestQ60 {
    public abstract int calculatePrice(TestQ60 testQ60);
    public void printtoy(TestQ60 testQ60){

    }
}
class EduToy extends TestQ60{

    @Override
    public int calculatePrice(TestQ60 testQ60) {
        return 0;
    }
}
class ConsToy extends TestQ60{

    @Override
    public int calculatePrice(TestQ60 testQ60) {
        return 0;
    }
}

// In this question other options are wrong since abstract methods can not have body and,
// if there are public methods all methods should have a body.
