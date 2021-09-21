package com.company;

import java.util.Scanner;

/*************************************************************
        Program:
        Author:Milena
        Date:14.09.2021
        Project:
        Description:
        **************************************************************/

public class InputReader {
    Scanner scanner = new Scanner(System.in);
    public int[] getNum(){
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    public char[] getInput(){
        System.out.println("\nEnter a Word: ");
        String word = scanner.next();
        char[] chars = new char[word.length()];
        for(int i = 0; i < chars.length; i++){
            chars[i] = word.charAt(i);
        }
        return chars;
    }
}
