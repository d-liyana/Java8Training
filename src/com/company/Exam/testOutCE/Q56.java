package com.company.Exam.testOutCE;

public class Q56 {
    void readCard (int cardNo) throws Exception {
        System.out.println("Reading Card");
    }
    void checkCard(int cardNo) throws RuntimeException  {     // line n1
        System.out.println("Checking Card");
    }
    public static void main(String[ ] args) {
        Q56 ex = new Q56( );
        int cardNo = 12344;
       //ex.readCard (cardNo);       // line n2
       ex.checkCard(cardNo);     // line n3
    }
}
