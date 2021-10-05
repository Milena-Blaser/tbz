package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayManager arrayManager = new ArrayManager();
        //Task 01 Binary Search
        Stopwatch stopwatch = new Stopwatch();
        int[] array = new int[10];
        arrayManager.initArray(array);
        arrayManager.sortArray(array);
        arrayManager.printArray(array);
        System.out.println();
        BinarySearch ob = new BinarySearch();
        int n = array.length;
        int x = 10;

        int result = ob.binarySearch(array, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
        System.out.println(stopwatch.elapsedTime());


    }
}
