class Solution {
    public int findTheWinner(int n, int k) {
        boolean[] arr = new boolean[n];
        return winner(arr , n , k , 0 , n);
    }
    public int winner(boolean[] person , int n , int k , int idx , int personleft){
        if(personleft == 1){
            for(int i = 0 ;  i < n ; i++){
                if(person[i] == false){
                    return i+1;
                }
            }
        }
        int kill = (k-1)%n;
        while(kill-- > 0){
            idx = (idx+1)%n;
            while(person[idx] == true){
                idx = (idx + 1)%n;
            }
        }
        person[idx] = true;

        while(person[idx] == true){
            idx = (idx+1)%n;
        }
        return winner(person , n , k , idx , personleft-1);
    }
}