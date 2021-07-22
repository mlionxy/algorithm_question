import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class leetcode278 {

    //使用二分查找，如果中间的为正确的，则错误的第一个版本在右面
    //时间复杂度O(logN),空间复杂度O(1)
    public int firstBadVersion(int n) {
        int left = 1,right = n;
        while(left < right){
            int mid = left + (rihgt - left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
            return left;
        }
    }
}