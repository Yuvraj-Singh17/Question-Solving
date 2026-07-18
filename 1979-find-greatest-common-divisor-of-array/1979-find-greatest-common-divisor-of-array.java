class Solution {
    public int findGCD(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        int ans = 1;
        for(int i = 2 ; i <= min ; i++){
            if(max % i == 0 && min % i == 0){
                ans = i;
            }
        }
        return ans;
    }
}