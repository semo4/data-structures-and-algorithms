
import java.util.Arrays;




public class CodeArray {
    public static void main(String[] args) {



        int[] arr = { 89, 2354, 3546, 23, 10, -923, 823, -12 };
        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
        //         101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197,
        //         199 };

        System.out.print(Arrays.toString(reverseArray(arr)));

    }

  

    public static int[] reverseArray(int[] number) {
        int len = number.length;
        int[] newArr = new int[len];
        int j = 0;

        for (int i = number.length - 1; i >= 0; i--) {
            newArr[j] = number[i];
            j++;
        }
        return newArr;

    }
}