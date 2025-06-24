package AK_01_Array;

public class AK_02_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("Max: " + findMax(arr));
        count(arr);
        revArr(arr);
        System.out.println("Second Largest: " + secondLargest(arr));
        System.out.println("Is Sorted: " + checkSortedArray(arr));
        System.out.println("Is Palindrome: " + checkPalindrome(arr));
        System.out.println("First Repeating: " + firstRepeating(arr));
    }

    // Find maximum element
    public static int findMax(int[] arr) {
        int maxEle = Integer.MIN_VALUE;
        for(int i : arr) {
            if(i > maxEle) {
                maxEle = i;
            }
        }
        return maxEle;
    }
    // Find Maximum element
    public static int findMin(int[] arr) {
        int minEle = Integer.MAX_VALUE;
        for(int i : arr) {
            if(i < minEle) {
                minEle = i;
            }
        }
        return minEle;
    }

    // count even and odd number in array
    public static void count(int[] arr) {
        int oddCount = 0;
        int evenCount = 0;
        for(int i : arr) {
            if(i%2==0) evenCount++;
            else oddCount++;
        }
        System.out.println("Odd Count: " + oddCount);
        System.out.println("Even Count: " + evenCount);
    }

    // Reverse an array
    public static void revArr(int[] arr) {
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // check palindrome
    public static boolean checkPalindrome(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }

    // find the second largest element
    public static int secondLargest(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    // first repeating element
    public static int firstRepeating(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]==arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    // Check array is sorted or not
    public static boolean checkSortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
