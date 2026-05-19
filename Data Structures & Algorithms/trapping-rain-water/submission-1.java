class Solution {
    public int trap(int[] height) {
        // O(n) time O(1) soln

        int left = 0, right = height.length-1,
        maxLeft = 0, maxRight = 0; 

        int res = 0;
        while(left <= right)
        {
            if(maxLeft<=maxRight)
            {
                int water = maxLeft - height[left];
                maxLeft = Math.max(maxLeft, height[left++]);
                res+= water <= 0 ? 0 : water;
            } else 
            {
                int water = maxRight - height[right];
                maxRight = Math.max(maxRight, height[right--]);
                res+= water <= 0 ? 0 : water;
            }
        }
        return res;
    }
}
