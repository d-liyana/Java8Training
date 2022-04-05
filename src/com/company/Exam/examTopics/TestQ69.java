package com.company.Exam.examTopics;

public class TestQ69 {
    static double area;
    int b=2, h=3;

    public static void main(String[] args) {
        double p=0,b=0,h=0;
        if(area==0){
            b=3;
            h=4;
            p=0.5;
        }
        area=p*b*h; // give a compilation error since variables do not initialize.
        // b an h instance variable  are initialized but those are not static.
        //local variables must initialized.
        System.out.println(area);
    }
}
//if variables initialized and compile code correctly it outputs 6.0 according to the inputs.