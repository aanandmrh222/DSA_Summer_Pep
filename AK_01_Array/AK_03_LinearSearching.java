package AK_01_Array;

public class AK_03_LinearSearching {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,8};
        System.out.println(linearSearch(arr,3));
    }

    // Linear Search
    public static boolean linearSearch(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==key) {
                return true;
            }
        }
        return false;
    }
}
