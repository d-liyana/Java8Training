package com.company.Exam.examTopics.question9;

public class ElectricAccount {
    private double kWh;
    private double rate=0.07;
    private double bill;

    //Following method is correct
public void addKWh(double kWh){
    if (kWh>0)
    this.kWh +=kWh;
    this.bill=this.kWh*this.rate;
    System.out.println(this.bill);
}
    // the method can't be private. because private can't accessed by object instance
/*private void addKWhdouble kWh){
        if (kWh>0)
            this.kWh +=kWh;
        this.bill=this.kWh*this.rate;
        System.out.println(this.bill);
    }*/
}
