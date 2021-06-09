
public class leetcode3 {

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len == 0){
            return 0;
        }
        int[] index = new int[128];
        int left = 0, right = 0;
        int size = 0;
        while(right < len){
            char c = s.charAt(right);
            while(index[c] > 0){
                index[s.charAt(left)]--;
                left++;
            }
            index[c]++;
            size = Math.max(size, right - left + 1);
            right++;
        }
        return size;
    }
}
