class Solution {
    public int maxArea(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int ans1 = 0;

        while(i < j){
            int h = Math.min(arr[i],arr[j]);
            int  l = j - i;

            ans1 = Math.max(ans1 , h * l);
            if(arr[i] < arr[j]){
                i++;
            }else{
                j--;
            }
        }

        return ans1;
    }
}