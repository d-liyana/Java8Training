package com.company.Exam.examTopics.question9;

public class TestQ9 {
    ElectricAccount ea=new ElectricAccount();

    public void useElectricity(double kWh){
        ea.addKWh(kWh);
    }

    public static void main(String[] args) {
        TestQ9 tq=new TestQ9();
        tq.useElectricity(300.0);

    }

}
