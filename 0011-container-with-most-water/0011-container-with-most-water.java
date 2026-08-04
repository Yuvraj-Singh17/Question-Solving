class Solution {
    public int maxArea(int[] arr) {
        int i = 0;
        int j = arr.length-1;

        int ans = 0;

        while(i < j){
            int l = Math.min(arr[i] , arr[j]);
            int b = j - i;

            ans = Math.max(ans , l * b);

            if(arr[i] > arr[j]){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}