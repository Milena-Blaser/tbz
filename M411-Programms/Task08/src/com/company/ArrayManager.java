package com.company;

/*************************************************************
 Program:
 Author:Milena
 Date:
 Project:
 Description:
 **************************************************************/

public class ArrayManager {
    public void initArray(int[] array) {
        int min = 0;
        int max = 15;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
    }

    public int[] sortArray(int[] array){
        for(int i = 0; i < array.length ; i++){
            for(int j = 0; j < array.length-1; j++){
                if(array[j] < array[i] ){
                    int bigger = array[i];
                    array[i] = array[j];
                    array[j] = bigger;
                }
            }
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ", ");
        }
    }
}


