package AK_01_Array;
import java.util.Arrays;

public class AK_04_Sorting {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,8};
//        selectionSort(arr);
//        bubbleSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Selection sort -- min element ko first pe lana hai
    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    // Bubble sort -- max element last me chala jata hai
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // Insertion sort -- element ko correct position shift karte hai
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i=1; i<n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}


/*
product based -- for sde role - problem solving only -
service based -- DSA -- Array, recursion, string, Math ques, linked list, single double, stack queue,  tree, binar search tree -- easy to imediate, development
 */

/*

Time complexity - It is a way to express how the running time of an algorithm increases with the input size
Big O -> represents the upper bound of running time
Thetha -> average case
Omega -> lower bound - best case





 */