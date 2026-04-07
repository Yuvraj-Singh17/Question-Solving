class Solution {
    int[][] dp;
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        dp = new int[1001][1001];

        for(int[] i : dp){
            Arrays.fill(i , -1);
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        return solve(pairs , 0 , -1);
    }
    public int solve(int[][] pairs , int idx , int p){
        if(idx >= pairs.length) return 0;

        if(p != -1 && dp[idx][p] != -1){
            return dp[idx][p];
        }
        int take = 0;
        if(p == -1 || pairs[idx][0] > pairs[p][1]){
            take = 1 + solve(pairs , idx+1 , idx);
        }
        int skip = solve(pairs , idx+1 , p);

        if(p != -1){
            dp[idx][p] = Math.max(take,skip);
        }
        return Math.max(take,skip);
    }
}