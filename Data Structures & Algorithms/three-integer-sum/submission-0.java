class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        

        for(int i=0; i<=nums.length-3; i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            int target = -1 * (nums[i]);
            while(left<right)
            {
                if(nums[left] + nums[right] < target)
                    left++;
                else if (nums[left] + nums[right] > target)
                    right--;
                else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    triplet.add(nums[i]);
                    res.add(triplet);
                    left++;
                    while(nums[left] == nums[left-1] && left<right)
                        left++;
                }
            }
        }
        return res;
    }
}
