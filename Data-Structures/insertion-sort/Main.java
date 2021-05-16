package com.example.insertionsort;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Insertionsort i = new Insertionsort();

//        int [] arr = {8,4,23,42,16,15};
//        int [] arr = {20,18,12,8,5,-2};
//        int [] arr = {5,12,7,5,5,7};
        int [] arr = {2,3,5,7,13,11};
//        int [] arr = {};
        System.out.println(Arrays.toString(i.insertionSort(arr)));
    }
}
