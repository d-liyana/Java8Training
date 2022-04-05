package com.company.Exam.testQuestions;

public class TestQuestion19ExamTopic {
    public static void main(String[] args) {
    TestQuestion19ExamTopic tq= new TestQuestion19ExamTopic();
    int cardNo=12345;
    tq.checkCard(cardNo);
    //tq.readCard(cardNo);

    }
    void readCard(int cardNo) throws Exception{
        System.out.println("Reading");
    }
    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("Checking");
    }
}
