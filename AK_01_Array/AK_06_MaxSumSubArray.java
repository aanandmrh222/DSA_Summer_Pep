package AK_01_Array;

public class AK_06_MaxSumSubArray {
    public static void main(String[] args) {

    }
    // use kadane algo - when curr sum is less than 0 it reset the current sum = 0
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            if(sum>maxSum) {
                maxSum = sum;
            }
            if(sum<0) sum = 0;
        }
        return maxSum;
    }
}
