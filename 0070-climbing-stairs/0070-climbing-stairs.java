class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);

        return F(n , dp);
    }

    public static int F(int n , int[] dp){
        if(n == 1 || n == 2){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = F(n-1,dp) + F(n-2,dp);
        return dp[n];
    }
}