package com.company.Exam.testQuestions;

public class TetLoopFor {
    public static void main(String[] args) {
        for(int ii=0;ii<3;ii++){
            System.out.println("ii "+ii);
            int count= 0;
            for (int jj=3;jj>0;jj--){
                System.out.println("jj "+jj);
                if (ii==jj){
                    ++count;
                    break;
                }
            }
            System.out.println(count);
            continue;
        }

    }
}
