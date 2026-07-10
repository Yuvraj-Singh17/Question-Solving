class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        int z = 0;
        int a = 0;
        for(int i = 0 ; i < moves.length() ; i++){
            if(moves.charAt(i) == 'U'){
                x++;
            }else if(moves.charAt(i) == 'L'){
                y++;
            }else if(moves.charAt(i) == 'R'){
                z++;
            }else{
                a++;
            }
        }
        if(x - a != 0 || y - z != 0){
            return false;
        }
        return true;
    }
}