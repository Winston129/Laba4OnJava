import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {10, 13, 16, 20, 30, 40, 50, 55, 60, 80, 90, 100};
        int[] arrBinarySearch = arr;
        int key = 30;
        int center_i;

        while(true)
        {
            center_i = (arr.length - 1) - ((arr.length - 1) / 2);

            if(arr[center_i] < key)
            {
                System.out.println(arr[center_i]);
                arr = Arrays.copyOfRange(arr, center_i, arr.length - 1);
            }
            else if(arr[center_i] > key)
            {
                System.out.println(arr[center_i]);
                arr = Arrays.copyOfRange(arr, 0, center_i);
            }
            else
            {
                System.out.println(arr[center_i]);
                System.out.println(Arrays.binarySearch(arrBinarySearch, key));
                break;
            }
        }
    }
}