class Solution {
    int[][] dp;
    public int solve(String[] words , int i , int p){
        if(i >= words.length) return 0;
        if(p != -1 && dp[i][p] != -1){
            return dp[i][p];
        }
        int take = 0;
        if(p == -1 || isPred(words[p] , words[i])){
            take = 1 + solve(words , i+1 , i);
        }
        int skip = solve(words , i+1 , p);
        if(p != -1){
            dp[i][p] = Math.max(skip , take);
        }
        return Math.max(skip , take);
    }
    public boolean isPred(String word1 , String word2){
        int M = word1.length();
        int N = word2.length();

        if(M > N || N-M != 1){
            return false;
        }
        int i = 0;
        int j = 0;

        while(i < M && j < N){
            if(word1.charAt(i) == word2.charAt(j)){
                i++;
            }
            j++;
        }
        return i == M;
    }
    public int longestStrChain(String[] words) {
        dp = new int[1001][1001];
        for(int[] i : dp){
            Arrays.fill(i , -1);
        }
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        return solve(words , 0 , -1);
    }
}