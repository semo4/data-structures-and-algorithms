package com.example.insertionsort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;



public class InsertionTest {
    @Test
    public void testEmpty() {
        Insertionsort l = new Insertionsort();
        int [] arr = {};
        assertTrue("the array is empty",l.insertionSort(arr).length==0);
    }
    @Test
    public void testUnsorted() {
        Insertionsort l = new Insertionsort();
        int [] arr = {8,4,23,42,16,15};
        int [] exp = {4, 8, 15, 16, 23, 42};
        assertEquals("the array is sorted",Arrays.toString(exp), Arrays.toString(l.insertionSort(arr)));
    }
    @Test
    public void testRevers() {
        Insertionsort l = new Insertionsort();
        int [] arr = {20,18,12,8,5,-2};
        int [] exp = {-2, 5, 8, 12, 18, 20};
        assertEquals("the array is sorted",Arrays.toString(exp), Arrays.toString(l.insertionSort(arr)));
    }

    @Test
    public void testFewUniques() {
        Insertionsort l = new Insertionsort();
        int [] arr = {5,12,7,5,5,7};
        int [] exp = {5, 5, 5, 7, 7, 12};
        assertEquals("the array is sorted",Arrays.toString(exp), Arrays.toString(l.insertionSort(arr)));
    }
    @Test
    public void testNearlySorted() {
        Insertionsort l = new Insertionsort();
        int [] arr = {2,3,5,7,13,11};
        int [] exp = {2,3,5,7,11,13};
        assertEquals("the array is sorted",Arrays.toString(exp), Arrays.toString(l.insertionSort(arr)));
    }


}
