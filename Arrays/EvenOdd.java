import java.util.Arrays;

public class EvenOdd {
    public static void Evenodd(int[] arr) {
        int[] even= new int[arr.length];
        int[] odd = new int[arr.length];
        int index=0;
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[index++]= arr[i];
            }
            else{
                odd[j++]= arr[i];
            }
        }
        //trim unwanted space
        even = Arrays.copyOf(even, index);
        odd = Arrays.copyOf(odd, j);

        System.out.println("Even elements "+Arrays.toString(even));
        System.out.println("Odd Elements "+Arrays.toString(odd));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Evenodd(arr);
    }
}