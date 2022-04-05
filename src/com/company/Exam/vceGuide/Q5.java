package com.company.Exam.vceGuide;

interface Exportable{
     void export();
}

class Tools implements Exportable{

    @Override
    public void export() {
        System.out.println("Export");
    }
}
class Q5 extends Tools {
    public void export(){

    }

    public static void main(String[] args) {
        Tools tl=new Q5();
        Q5 t2=new Q5();

    }

    public static void CallExport(Exportable ex){
        ex.export();
    }

}
