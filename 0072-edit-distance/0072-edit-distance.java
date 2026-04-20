class Solution {
    public int editDistance(String s1, String s2, int m, int n) {
        int[][] t = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0)
                    t[i][j] = i + j;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    t[i][j] = t[i - 1][j - 1];
                else
                    t[i][j] = 1 + Math.min(Math.min(t[i][j - 1], t[i - 1][j]), t[i - 1][j - 1]);
            }
        }
        return t[m][n];
    }

    public int minDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        return editDistance(s1, s2, m, n);
    }
}