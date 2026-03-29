import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] Board = new char[n][n];
        for (char[] row : Board) {
            Arrays.fill(row, '.');
        }

        boolean[] col = new boolean[n];
        boolean[] left = new boolean[2*n-1];
        boolean[] right = new boolean[2*n-1];

        find(n, ans, 0, 0, col, left, right, Board);
        return ans;
    }

    public static void find(int n, List<List<String>> ans, int row, int col,
                            boolean[] column, boolean[] left, boolean[] right, char[][] Board) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(Board[i]));
            }
            ans.add(temp);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (!column[j] && !left[row + j] && !right[n - 1 + j - row]) {

                Board[row][j] = 'Q';
                column[j] = true;
                left[row + j] = true;
                right[n - 1 + j - row] = true;

                find(n, ans, row + 1, col, column, left, right, Board);

                Board[row][j] = '.';
                column[j] = false;
                left[row + j] = false;
                right[n - 1 + j - row] = false;
            }
        }
    }
}