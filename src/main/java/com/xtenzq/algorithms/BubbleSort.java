package com.xtenzq.algorithms;

public class BubbleSort {

    /**
     * Bubble sort algorithm implementation
     * Time complexity O(n^2)
     * Space complexity O(1)
     * Stable
     *
     * @param arr input array
     */
    public static void sort(int[] arr) {
        boolean hasSwapped = true;
        while (hasSwapped) {
            hasSwapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    hasSwapped = true;
                }
            }
        }
    }
}
