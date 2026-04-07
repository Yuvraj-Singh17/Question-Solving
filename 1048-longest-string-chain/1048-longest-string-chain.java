class Solution {
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
        int[] dp = new int[words.length];

        Arrays.fill(dp , 1);
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        int max = 1;
        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ;  j < i ; j++){
                if(isPred(words[j] , words[i])){
                    dp[i] = Math.max(dp[i] , dp[j]+1);
                    max = Math.max(dp[i] , max);
                }
            }
        }
        return max;

    }
}