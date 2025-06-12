// Java sort Array by Bubble Sort 
import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSortmet(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){

            for(int j=0; j<n-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {98, 11, 43, 52, 90, 22, 34};
        BubbleSortmet(arr);
        System.out.println("The Array after Sorting"+ Arrays.toString(arr));

    }
}
