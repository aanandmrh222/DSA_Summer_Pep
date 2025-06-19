package AK_01_Array;
import java.util.Scanner;

public class AK_06_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter the elements: ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
