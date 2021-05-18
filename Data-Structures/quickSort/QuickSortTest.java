package com.example.quicksoet;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class QuickSortTest {
    @Test
    public void testEmpty() {
        QuickSort l = new QuickSort();
        int [] arr = {};
        assertTrue("the array is empty",l.sort(arr).length==0);
    }
    @Test
    public void testUnsorted() {
        QuickSort l = new QuickSort();
        int [] arr = {8,4,23,42,16,15};
        int [] exp = {4, 8, 15, 16, 23, 42};
        assertEquals("the array is sorted",Arrays.toString(exp), Arrays.toString(l.sort(arr)));
    }
    @Test
    public void testRevers() {
        QuickSort l = new QuickSort();
        int [] arr = {20,18,12,8,5,-2};
        int [] exp = {-2, 5, 8, 12, 18, 20};
        assertEquals("the array is sorted",Arrays.toString(exp), Arrays.toString(l.sort(arr)));
    }

    @Test
    public void testFewUniques() {
        QuickSort l = new QuickSort();
        int [] arr = {5,12,7,5,5,7};
        int [] exp = {5, 5, 5, 7, 7, 12};
        assertEquals("the array is sorted",Arrays.toString(exp), Arrays.toString(l.sort(arr)));
    }
    @Test
    public void testNearlySorted() {
        QuickSort l = new QuickSort();
        int [] arr = {2,3,5,7,13,11};
        int [] exp = {2,3,5,7,11,13};
        assertEquals("the array is sorted",Arrays.toString(exp), Arrays.toString(l.sort(arr)));
    }
}
