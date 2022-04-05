package com.company.Exam.testQuestions;

public class TestArithmeticException {
    public static void main(String[] args) {
        int ax=10,az=30;
        int aw=1, ay=1;

        try {
            aw=ax%2;
            ay=az/aw;
            System.out.println(aw);
            System.out.println(ay);
            
        }
        catch (ArithmeticException e1){
            System.out.println("Arithmetica Exception");
        }catch (Exception e){
            aw=1;
            System.out.println("Exception");
        }
    ay=az/aw;
        System.out.println("Successfull "+ay);
    }

}
