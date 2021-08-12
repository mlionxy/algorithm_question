class leetcode75 {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int ptr = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
        for(int i = ptr; i < n;i++){
            if(nums[i] == 1){
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
    }

}