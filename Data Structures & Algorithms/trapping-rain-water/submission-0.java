class Solution {
    public int trap(int[] height) {
        if(height.length<=2) return 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int max = 0;
        for(int i=1; i<height.length; i++)
        {
            max = Math.max(max,height[i-1]);
            maxLeft[i] = max;
        }
        max = 0;
        for(int i=height.length-2; i>=0; i--)
        {
            max = Math.max(max,height[i+1]);
            maxRight[i] = max;
        }
        max = 0;
        for(int i=0; i<height.length; i++)
        {
            int water = Math.min(maxLeft[i],maxRight[i]) - height[i];
            max+= water <= 0 ? 0 : water;
        }
        return max;
    }
}
