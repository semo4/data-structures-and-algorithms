package challenges.testJava;

import org.junit.Test;
public class BinarySearch {
    @Test
    public void testBinarySearchExist() {
        int[] arr = { 4, 8, 15, 16, 23, 42 };
        int result = BinarySearch.binarySearch(arr, 15);
        assertEquals("the index is ", 2, result);
    }

    @Test
    public void testBinarySearchNotExist() {
        int[] arr = { 11, 22, 33, 44, 55, 66, 77 };
        int result = BinarySearch.binarySearch(arr, 90);
        assertEquals("the index is ", -1, result);
    }

    @Test
    public void testBinarySearchEmpty() {
        int[] arr = {};
        int result = BinarySearch.binarySearch(arr, 5);
        assertEquals("the index is ", -1, result);
    }
}
