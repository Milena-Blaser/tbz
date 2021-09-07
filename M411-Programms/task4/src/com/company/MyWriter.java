package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*************************************************************
        Program:
        Author:Milena
        Date:31.08.2021
        Project:
        Description:
        **************************************************************/

public class MyWriter {
    PrintWriter pw;

    {
        try {
            pw = new PrintWriter("aReallyCoolFile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    ;

public void printReverse(String text){
    pw.write(new StringBuffer(text).reverse().toString());
    pw.close();
    }

}
