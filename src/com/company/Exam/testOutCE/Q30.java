package com.company.Exam.testOutCE;

public class Q30 {
        private char var;
        public static void main(String[ ] args) {
            char var1 = 'a';
            char var2 = var1;
            var2 = 'e';

            Q30 obj1 = new Q30();
            Q30 obj3=new Q30();
            Q30 obj2 = obj1;
            obj1.var = 'o';
            obj2.var = 'i';
            obj3.var='u';
            System.out.println(var1 + ", " + var2);
            System.out.println(obj1.var + ", " + obj2.var+" ,"+ obj3.var);
        }
}
