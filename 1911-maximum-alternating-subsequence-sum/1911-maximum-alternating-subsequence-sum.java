class Solution {
    long[][] t;

    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        t = new long[n][2];

        for(int i = 0; i < n; i++){
            Arrays.fill(t[i], -1);
        }

        return solve(0, nums, 1); 
    }

    public long solve(int idx, int[] nums, int flag){
        if(idx == nums.length) return 0;

        if(t[idx][flag] != -1){
            return t[idx][flag];
        }

        long skip = solve(idx + 1, nums, flag);

        long val = (flag == 1) ? nums[idx] : -nums[idx];
        long take = solve(idx + 1, nums, 1 - flag) + val;

        return t[idx][flag] = Math.max(skip, take);
    }
}