class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }
        }
        System.out.println(sb);
        

        int i = 0;
        int j = sb.length()-1;

        while(i <= j){
            if(sb.charAt(i) != sb.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}