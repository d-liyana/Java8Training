package com.company.Exam.examTopics.q119;

public interface Exportable {
    default void export() {
    }
}

class Tool implements Exportable{

    @Override
    public void export() {
        System.out.println("Tool: Export");
    }
}

class ReportTool extends Tool implements Exportable{
    public void export(){
        System.out.println("RTool : Export");
    }

    public static void main(String[] args) {
        Tool tb=new ReportTool();
        Tool tb1=new Tool();

        callExpert(tb);
        callExpert(tb1);
    }

    public static void callExpert(Exportable ex){
        ex.export();
    }
}
