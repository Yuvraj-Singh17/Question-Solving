class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        gP(n , 0 , 0 , ans , sb);
        return ans;
    }
    public void gP(int n , int left , int right , List<String> ans , StringBuilder sb){
        if(left + right == 2 * n){
            ans.add(new String(sb.toString()));
        }

        if(left < n){
            sb.append('(');
            gP(n , left + 1 , right , ans , sb);
            sb.delete(sb.length() - 1 , sb.length());
        }

        if(right < left){
            sb.append(')');
            gP(n , left , right+1 , ans , sb);
            sb.delete(sb.length() - 1 , sb.length());
        }
    }
}