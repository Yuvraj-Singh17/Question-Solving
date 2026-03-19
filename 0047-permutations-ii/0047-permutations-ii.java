class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
        
    }

    public static void helper(int[] nums, int idx, List<List<Integer>> ans) {
        int n = nums.length;
        if (idx == n - 1) {
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }
        int[] use = new int[21];
        for (int i = idx; i < n; i++) {
            if (use[nums[i]+ 10] == 0) {
                swap(i, idx, nums);
                helper(nums, idx + 1, ans);
                swap(i, idx, nums);
                use[nums[i] + 10]  = 1;
            }
        }
    }

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}