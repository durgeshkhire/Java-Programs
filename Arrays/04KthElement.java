//Find the "Kth" max and min element of an array
import java.util.Arrays;
import java.util.Scanner;

public class KthElement {
    public static void KthMaxEle(int [] arr, int k) {
        if(k<0 || k> arr.length){
            System.out.println("The element does not exist");
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int KthMin = arr[k-1];
        int KthMax = arr[arr.length-k];
        System.out.println("The "+k+"th Minimum number in array is "+KthMin);
        System.out.println("The "+k+"th Maximum number in array is "+KthMax);
    }

    public static void main(String[] args) {
        int[] arr = {67, 13, 22, 34, 48, 91, 72};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kth Element to findout Maximum & Minimum num in array ");
        int k = sc.nextInt();
        KthMaxEle(arr, k);

    }
}
