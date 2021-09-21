package com.company;

/*************************************************************
 Program:
 Author:Milena
 Date:14.09.2021
 Project:
 Description:
 **************************************************************/

public class ArrayManager {
    public void initArray(int[] array) {
        int min = 0;
        int max = 200;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
    }

    public void printArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ", ");
        }
    }
    public int getSmallestNum(int[] array){
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    public int getBiggestNum(int[] array){
        int biggest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (biggest < array[i]) {
                biggest = array[i];
            }
        }
        return biggest;
    }
    public void printReverseNumArray(int[] array){
        for(int i = array.length -1 ; i >= 0; i--){
            System.out.print(array[i] + ", ");
        }
    }
    public void printReverseCharArray(char[] array){
        for(int i = array.length -1 ; i >= 0; i--){
            System.out.print(array[i]);
        }
    }
    public int[] sortNum(int[] numbers){
        for(int i = 0; i < numbers.length ; i++){
            for(int j = 0; j < numbers.length-1; j++){
                if(numbers[j] < numbers[i] ){
                    int bigger = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = bigger;
                }
            }
        }
        return numbers;
    }
}

