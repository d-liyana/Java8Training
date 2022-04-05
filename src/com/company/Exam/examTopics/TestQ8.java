package com.company.Exam.examTopics;

import java.io.IOException;

class X{
    // add throws IOException
    public void fileContent() throws IOException{
        throw new IOException();
    }
}

public class TestQ8 {
    // add throws IOException
    public static void main(String[] args) throws IOException {
        X onjX=new X();
        onjX.fileContent();
    }
}


// In this question if add throws IOException in 2 methods it will compile and throw IO exception in runtime.