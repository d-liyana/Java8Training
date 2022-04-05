package com.company.Exam.examTopics.q11;

abstract class TestQ11 implements Readable {
    public void readBook(){
    }

    //public abstract void setBookMark();

}

/*class EBook extends TestQ11{

    //Without this it doesn't compile
    @Override
    public void setBookMark() {

    }
}*/

//If we use "public abstract void setBookMark();" in class TestQ11 we should  add " public void setBookMark() {}" in EBook class

abstract class EBook extends TestQ11{

}
