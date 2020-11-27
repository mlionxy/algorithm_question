public class leetcode1512 {

    public int numIdenticalPairs(int[] nums) {
        int[] cnt = new int[101];
        int ans = 0;
        for (int num : nums) {
            ans += cnt[num];
            cnt[num]++;
        }
        return ans;
    }

}
