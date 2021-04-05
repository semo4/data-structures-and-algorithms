package challenges.testJava;

import org.junit.Test;
import static org.junit.Assert.*;

public class insertShiftArrayTest {
    @Test
    public void testInsertShiftArrayEven() {
        int[] array = { 2, 4, 6, 8 };
        int[] resultArray = { 2, 4, 5, 6, 8 };
        assertArrayEquals("the even array  ", resultArray, ArrayShift.insertShiftArray(array, 5));
    }

    @Test
    public void testInsertShiftArrayOdd() {
        int[] array = { 4, 8, 15, 23, 42 };
        int[] resultArray = { 4, 8, 15, 16, 23, 42 };
        assertArrayEquals("the odd array  ", resultArray, ArrayShift.insertShiftArray(array, 16));
    }

    @Test
    public void testInsertShiftArrayEmpty() {
        int[] array = new int[] {};
        int[] resultArray = { 1 };
        assertArrayEquals("the even array  ", resultArray, ArrayShift.insertShiftArray(array, 1));
    }
}
