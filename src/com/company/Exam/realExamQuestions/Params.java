package com.company.Exam.realExamQuestions;

public class Params {
    Integer i=20;
    Integer a=30;
    Integer d=Integer.parseInt("27");
    Double b=200D;
    double r=200;
    Double c=29.02;
    Double e=Double.parseDouble("34");
    String f="Foo";
    int g='9';
    byte h=127;
    byte j=9;
    Short k=89;
    short l=78;
    short m='4';
    Short n=Short.parseShort("23");
   // Short o=Short.parseShort("A");//Compile. gives runtime exception as numberformatException
    Float p=600f;
    float q=500;
    Integer s=100_00;
    int t=89_787;
    int u=78_90;
    Long v=569l;
    long w=78;
    float x=(float) 89;
    float y=(Float) 89f;
    double z=(Double)2D;

    public static void main(String[] args) {
        Params p=new Params();
        System.out.println(p.e);
        System.out.println(p.y);
    }


}
