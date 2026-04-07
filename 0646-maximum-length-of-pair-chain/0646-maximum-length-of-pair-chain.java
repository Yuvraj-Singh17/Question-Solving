class Solution {
    public int findLongestChain(int[][] pairs) {
        int[] dp = new int[pairs.length];
        Arrays.fill(dp , 1);
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        int max = 1;
        for(int i = 0 ; i < pairs.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(pairs[i][0] > pairs[j][1]){
                    dp[i] = Math.max(dp[i] , dp[j]+1);
                    max = Math.max(dp[i] , max);
                }
            }
        }
        return max;
    }
}