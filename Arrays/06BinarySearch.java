// Binary search to search number in array

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int x){
        int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid = low+ (high - low)/2;
            if(arr[mid]== x)
                return mid;

            if (arr[mid]< x)
                low= mid+1;
            else
                high = mid-1;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 32, 21, 11, 43, 55, 23, 74, 54};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int x= 23;
        int result= binarySearch(arr, x);
        if (result== -1)
            System.out.println("The element is not present in array");
        else
            System.out.println("The element present at position "+result);

    }
}
//  Time Complexity= O(log n)
