class Solution {
    int[][] dp ;
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[2501][2501];
        for(int[] i : dp){
            Arrays.fill(i , -1);
        }
        return solve(nums , 0 , -1);
    }
    public int solve(int[] nums , int i , int p){
        if(i >= nums.length) return 0;

        if(p != -1){
            if(dp[i][p] != -1 ){
            return dp[i][p];
        }
        }
        int take = 0;
        if(p == -1 || nums[p] < nums[i]){
            take = 1 + solve(nums, i+1 , i);
        }
        int skip = solve(nums,  i+1 , p);
        if(p != -1){
            dp[i][p] = Math.max(skip , take);
        }
        return Math.max(skip , take);
    }
}