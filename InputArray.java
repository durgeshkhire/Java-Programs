import java.sql.Array;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        System.out.println("the size of an array "+size);

        int[] arr= new int[size];
        System.out.println("Enter the "+size+" elements in an array");
        for (int i= 0; i<size; i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("The elements you entered in array are");
        for (int i= 0; i< size; i++){
            System.out.println("The element at"+i+"th position is" +arr[i]);
        }


    }
}
