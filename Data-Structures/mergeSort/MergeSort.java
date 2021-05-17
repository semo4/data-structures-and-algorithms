package com.example.mergesort;

import java.util.Arrays;

public class MergeSort {

    int[] aux;
    public int[] sort(int[] arr) {
        aux = new int[arr.length];
        sort(arr, 0, arr.length-1);
        return arr;
    }

    private void sort(int[] arr, int left, int right) {
        if (right <= left) {
            return;
        }
        int mid = left + (right - left)/2;
        sort(arr, left, mid);
        sort(arr, mid+1, right);
        merge(left, mid, right, arr);
    }

    // helper method to merge two sorted arrays together into one sorted array
    private void merge(int left, int mid, int right, int[] arr) {
       int i = left, j = mid + 1;

        for (int k = left; k <= right; k++) {
            aux[k] = arr[k];
        }
        for (int k = left; k <= right;  k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > right) {
                arr[k] = aux[i++];
            } else if (aux[i] < aux[j]) {
                arr[k] = aux[i++];
            } else {
                arr[k] = aux[j++];
            }
        }
    }

}
