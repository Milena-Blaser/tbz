package com.company;

import java.util.ArrayList;

import static com.company.ArrayManager.*;

public class Main {

    public static void main(String[] args) {
        //task 3.1
       ArrayManager arrayManager = new ArrayManager();
        int[] randomNum = new int[10000];
        arrayManager.initArray(randomNum);
        long start = System.currentTimeMillis();
        /*arrayManager.printArray(randomNum);
        int smallest = arrayManager.getSmallestNum(randomNum);
        System.out.println("\nSmallest number: " + smallest);
        int biggest = arrayManager.getBiggestNum(randomNum);
        System.out.println("Biggest number: " + biggest);
        System.out.println();

        //task 3.2
        InputReader reader = new InputReader();
        int[] numbers = reader.getNum();
        arrayManager.printReverseNumArray(numbers);

        //task 3.3
        char[] chars =  reader.getInput();
        arrayManager.printReverseCharArray(chars);
*/
        //task 4.2
        System.out.print("unsorted: ");
        arrayManager.printArray(randomNum);
        System.out.println();
        System.out.print("sorted: ");
        int[] sorted = arrayManager.sortNum(randomNum);
        long end = System.currentTimeMillis();
        arrayManager.printArray(sorted);
        long result = end - start;
        System.out.println();
        System.out.println(result);

    }
}
