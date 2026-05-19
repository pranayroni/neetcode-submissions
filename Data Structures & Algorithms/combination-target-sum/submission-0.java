class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;
    int target;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.nums = nums; this.target = target;
        helper(0, 0, new ArrayList<>());
        return res;
    }
    private void helper(int i, int total, List<Integer> list)
    {
        if(i>= nums.length || total > target) return;
        if(total == target) // combination found!
        {
            res.add(new ArrayList<>(list));
            return;
        }
        // decision tree
        // left branch
        list.add(nums[i]);
        helper(i, total + nums[i], list); // continue consider ith candidate
        // right branch
        list.remove(list.size()-1);
        helper(i+1, total, list); // restrict this ith candidate
        
    }
}
