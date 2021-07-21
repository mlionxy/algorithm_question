class leetcode704 {

    //如果target等于中间值则返回，如果小于则向左搜索，如果大于则向右搜索
    //时间复杂度O(logN)，空间复杂度O(1)
    public int search(int[] nums, int target) {
        int pivot,left = 0,right = nums.length - 1;
        while(left <= right){
            pivot = left + (right - left) / 2;//中间下标
            if(nums[pivot] == target){
                return pivot;
            }
            if(target < nums[pivot]){
                right = pivot - 1;
            }else{
                left = pivot + 1;
            }
        }
        return -1;
    }

}