package com.xtenzq.algorithms;

public class SelectionSort {

    /**
     * Selection sort algorithm implementation
     * Time complexity O(n^2)
     * Space complexity O(1)
     * Not stable
     *
     * @param arr input array
     */
    public static void sort(int[] arr) {
        int indexOfMinElement = 0;
        for (int i = 0; i < arr.length; i++) {
            indexOfMinElement = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMinElement]) {
                    indexOfMinElement = j;
                }
            }
            int temp = arr[indexOfMinElement];
            arr[indexOfMinElement] = arr[i];
            arr[i] = temp;
        }
    }
}
