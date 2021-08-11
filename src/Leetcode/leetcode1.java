import java.util.HashMap;
import java.util.Map;

public class leetcode1 {

    //哈希解法，从哈希表中查找是否有对应的另一个值
    //时间复杂度O(N) 空间复杂度O(N)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return null;
    }
	
}
