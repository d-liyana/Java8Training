package com.company.Exam.testOutCE;

public class Q47 {
    private int amount;
    public Q47 (int amount) {
        this.amount = amount;
    }
    public int getAmount( ) {
        return amount;
    }
    public void setAmount (int amount) {
        this.amount = amount;
    }
    public void changeAmount (int x) {
        amount += x;
    }

    public static void main(String[] args) {

        Q47 acct = new Q47 ((int) (Math.random( )*1000));
        //acct.amount=0;//0
       // acct.changeAmount (-acct.amount);//0
        //acct.setAmount(0);//0
        //acct.setAmount(-acct.getAmount( ));//-898
        acct.changeAmount(0);//505


        System.out.println(acct.getAmount( ));
    }
}
