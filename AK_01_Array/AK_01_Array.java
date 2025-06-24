package AK_01_Array;
import java.util.Scanner;

public class AK_01_Array {
    public static int arrSum(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter the elements: ");
            arr[i] = sc.nextInt();
        }


        System.out.println(arrSum(arr));
    }
}
