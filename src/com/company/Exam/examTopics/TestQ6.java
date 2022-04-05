package com.company.Exam.examTopics;


    abstract class Planet{
        protected void revolve(){
        }

        abstract void rotate();
    }

    class TestQ6 extends Planet {

        public void revolve(){

        }
   /*  or
   protected void revolve(){

    }*/
        // Can't do as follows
/*    void revolve(){

    }*/

        protected void rotate() {

        }
}
