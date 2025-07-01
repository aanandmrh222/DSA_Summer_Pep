package AK_03_Recursion;

public class AK_01_QuickSort {
    public static void main(String[] args) {

    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start <= end) return;
        int p = partition(arr, start, end);
        quickSort(arr, start, p-1);
        quickSort(arr, p+1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start+1; i <= end; i++) {
            if(arr[i] <= pivot) count++;
        }
        int pivotIndex = start+count;
        swap(arr[pivotIndex], arr[start]);

        int i = start;
        int j = end;

        while (i<pivotIndex && j>pivotIndex) {
            while (arr[i] < pivot) i++;
            while (arr[i] > pivot) j--;

            swap(arr[i++], arr[j--]);
        }
        return pivotIndex;
    }

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
}
