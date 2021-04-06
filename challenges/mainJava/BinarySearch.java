public class BinarySearch {
  
    public static void main(String[] args) {
       

        int[] arr = { 11, 22, 33, 44, 55, 66, 77 };
        System.out.println(binarySearch(arr, 15));
    }

 
    public static int binarySearch(int[] arr, int number) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] < number) {
                low = mid + 1;
            } else if (arr[mid] == number) {
                return mid;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }
}