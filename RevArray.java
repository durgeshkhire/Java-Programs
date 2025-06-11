import java.util.Arrays;

public class RevArray {
    public static void Revarr(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;

        }

    }
    public static void main(String[] args) {
        int[] arr ={10,20, 30, 40, 50};
        System.out.println(Arrays.toString(arr)); // before Reversing array
        Revarr(arr);
        System.out.println(Arrays.toString(arr)); //After Reversing array
    }
}
