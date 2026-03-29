class Solution {
    public void solveSudoku(char[][] board) {
        find(0 , 0 , board);
    }
    public static boolean find(int i , int j , char[][] board){
        if(i == 9){
            return true;
        }
        if(j == 9){
            return find(i + 1 , 0 , board);
        }
        if(board[i][j] != '.'){
            return find(i , j+1 , board);
        }
        for(int num = 1 ; num < 10 ; num++){
            if(check(num , board , i , j)){
                board[i][j] = (char)('0'+ num);
                if(find(i , j+1 , board)) return true;
                board[i][j] = '.';
            }
        }
        return false;
    }
    public static boolean check(int num , char[][] board , int i, int j){
        char c =(char) ('0' + num);

        for(int col = 0 ; col < 9 ; col++){
            if(board[i][col] == c){
                return false;
            }
        }
        for(int row = 0 ; row < 9 ; row++){
            if(board[row][j] == c){
                return false;
            }
        }

        int row = i/3*3;
        int col = j/3*3;

        for(int a = row ; a < row+3 ;a++){
            for(int b = col ; b < col+3 ; b++){
                if(board[a][b] == c){
                    return false;
                }
            }
        }
        return true;
    }
}