class leetcode11 {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int tempArea = (j - i) * (height[i] < height[j] ? height[i++] : height[j--]);
            maxArea = tempArea > maxArea ? tempArea : maxArea;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] test = new int[]{2,3,2,1,4,3};
        System.out.println(maxArea(test));
    }
}