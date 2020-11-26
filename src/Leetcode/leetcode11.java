package Leetcode;

public class leetcode11 {
    public static void main(String[] args) {
        System.out.println("hello!");
    }

    public int[] runningSum(int[] nums) {
        for(int i = 1; i<nums.length; ++i){
            nums[i] += nums[i-1];
        }

        return nums;
    }
}
