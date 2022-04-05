package com.company.Exam.examTopics.q128;

import com.company.Exam.realExamQuestions.QuestionsAboutPkg.B;

public interface Downloadable {
    public void download();
}

interface Readable extends Downloadable{
    public void readBook();
}

abstract class Book implements Readable{
    public void readBook(){
        System.out.println("Read Book");
    }
}

class Ebook extends Book{

 public void readBook(){
     System.out.println("Read E-Book");
 }

    @Override
    public void download() {

    }

    public static void main(String[] args) {
        Book book=new Ebook() ;
        book.readBook();
    }
}
