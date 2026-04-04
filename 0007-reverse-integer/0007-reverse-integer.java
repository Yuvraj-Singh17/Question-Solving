class Solution {
    public int reverse(int x) {
        int temp = x;
        int rev = 0;
        if(x < 0){
            x = x*-1;
        }
        while (x != 0) {
            int digit = x % 10;
            
            if (rev > Integer.MAX_VALUE / 10 ||rev < Integer.MIN_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return 0; 
            }
            
            rev = rev * 10 + digit;
            x /= 10;
        }
        if(temp < 0){
            return rev*-1;
        }
        return rev;
    }
}
