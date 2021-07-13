class leetcode53 {

    //时间复杂度O(N)
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;//计算累计值
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);//比较最大值
        }
        return ans;
    }
}