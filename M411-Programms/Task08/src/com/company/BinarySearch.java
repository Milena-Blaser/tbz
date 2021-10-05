package com.company;
/*************************************************************
        Program:
        Author:Milena
        Date:28.09.2021
        Project:
        Description:
        **************************************************************/

public class BinarySearch {
    int binarySearch(int arr[], int min, int max, int x)
    {
        if (max >= min) {
            int mid = min + (max - min) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x){
                return mid;
            }
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x) {
                return binarySearch(arr, mid + 1, max, x);
            }
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, min, mid - 1, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }


}
