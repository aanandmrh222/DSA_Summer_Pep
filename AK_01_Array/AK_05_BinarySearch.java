package AK_01_Array;

public class AK_05_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,9};
        System.out.println(firstOccurrece(arr,4));
    }
    public static boolean binarySearch(int[] arr, int key) {
        int start = 0, end = arr.length -1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==key) {
                return true;
            } else if (key>arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }
    // first occurrence
    public static int firstOccurrece(int[] arr, int key) {
        int start = 0, end = arr.length-1;
        int res = -1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                res = mid;
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    // last occurrence
    public static int lastOccurrence(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                res = mid;
                start = mid + 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    public static int totalOccurrences(int[] arr, int key) {
        int first = firstOccurrece(arr, key);
        if (first == -1) return 0;
        int last = lastOccurrence(arr, key);
        return last - first + 1;
    }
}


/*
arr = {1,3,3,3,3,5,7,8,8}
find first and last occurrence of 3
find the total occurrence of 3 -> last - first

 */