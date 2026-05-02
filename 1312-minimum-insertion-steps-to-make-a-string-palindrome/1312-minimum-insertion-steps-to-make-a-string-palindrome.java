class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int m = s.length();
        int[] d = new int[n+1];

        for(int  i = 1 ; i <= m ; i++){
            int previousDiagonal = 0;
            for(int j = 1 ; j <= n ; j++){
                int t = d[j];
                if(s.charAt(i-1) == s.charAt(n-j)){
                    d[j] = 1 + previousDiagonal;
                }else{
                    d[j] = Math.max(d[j-1] , t);
                }
                previousDiagonal = t;
            }
        }
        return s.length()-d[n];
    }
}