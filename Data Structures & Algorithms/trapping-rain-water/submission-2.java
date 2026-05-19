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
                maxLeft = Math.max(maxLeft, height[left]);
                res+= maxLeft - height[left++];
            } else 
            {
                maxRight = Math.max(maxRight, height[right]);
                res+= maxRight - height[right--];
            }
        }
        return res;
    }
}
