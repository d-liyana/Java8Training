package com.company.Exam.testOutCE;

public class Q12 {
    public static void main(String[] args) throws LogFileException {
        Q12 q12 = new Q12();
        try {
            q12.open();
            q12.process();

        } catch (Exception ex) {
            System.out.println("complete");
        }

    }

    public void process() {
        System.out.println("Process");
        throw new LogFileException();
    }

    public void open() throws AccessViolationException   {
        System.out.println("Open");
        throw new AccessViolationException();
    }


}
