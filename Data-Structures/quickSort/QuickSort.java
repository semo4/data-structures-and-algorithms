package com.example.quicksoet;

public class QuickSort {

    public int[] sort(int[] arr){
        if(arr.length!=0){
            quickSort(arr, 0, arr.length-1);
            return arr;
        }
        return arr;

    }

    public void quickSort(int[] arr, int low , int high){
        int splitPoint = partition(arr, low, high);

        if(low<splitPoint){
            quickSort(arr, low, splitPoint-1);
        }
        if(high> splitPoint){
            quickSort(arr, splitPoint+1, high);
        }

    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        while(low<high){
            while(arr[high]>= pivot && low< high){
                high--;

            }
            if(low != high){
                arr[low] = arr[high];
                low++;
            }
            while(arr[low]<= pivot && low< high){
                low++;
            }
            if(low != high){
                arr[high] = arr[low];
                high--;
            }

        }
        arr[low] = pivot;
        return low;
    }
}
