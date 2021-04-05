import java.util.Arrays;
public class ArraysShift {
   

    public static void main(String[] args) {
        int[] arr1  = {4,8,18,23,42};
        System.out.println(Arrays.toString(insertShiftArray(arr1, 15)));

    }
    
    public static int[] insertShiftArray(int[] arr, int num){
        int[] newArray = new int[arr.length+1];
        int midValue = (int) Math.ceil(arr.length/2.0);
        for(int j=0; j<arr.length ;j++){
            newArray[j]= arr[j];
        }
        for(int i =newArray.length-2; i > midValue ; i--){
            newArray[i+1] = newArray[i];
        }
        newArray[midValue] = num;
        return newArray;


    }
}