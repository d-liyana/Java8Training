package com.company.Exam.examTopics;

public class TestQ23 {
    int x=100;
    int a=x++;
    int b=++x;
    int c=x++;
   // int d=(a<b)?(a<c)?a:(b<c)?b:c; //if we use this it gives a compilation error coz this statement means as follows

 /*   if(a<b){
     if(a<c){
         a;
     }else if (b<c){
         b;
     }else {
         c
     }
     }*/

    //If we  define as follows again it gives a compilation error  since a is not a boolean valuwe
   // int d=(a<b)?(a<c):a ?(b<c):b ;

}
