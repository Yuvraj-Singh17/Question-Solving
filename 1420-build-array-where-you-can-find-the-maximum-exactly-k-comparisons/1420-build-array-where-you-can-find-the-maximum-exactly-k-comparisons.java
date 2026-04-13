class Solution {
    int MOD = 1000000000+7;
    int N;
    int M;
    int K;
    int[][][] dp;
    public int numOfArrays(int n, int m, int k) {
        N = n;
        M = m;
        K = k;
        dp = new int[51][51][101];
        for(int i = 0; i < 51; i++){
            for(int j = 0; j < 51; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return solve(0 , 0 , 0);
    }
    public int solve(int i , int searchCost , int maxSoFar){
        if(i == N){
            if(searchCost == K){
                return 1;
            }
            return 0;
        }
        if(dp[i][searchCost][maxSoFar] != -1){
            return dp[i][searchCost][maxSoFar];
        }
        int res = 0;
        for(int j = 1 ; j <= M ; j++){
            if(j > maxSoFar){
                res = (res + solve(i+1 , searchCost + 1 , j )) % MOD ;
            }else{
                res = (res + solve(i+1 , searchCost , maxSoFar )) % MOD;
            }
        }
        return dp[i][searchCost][maxSoFar] = res%MOD;
    }
}