class Solution {
     public void reverse(int[]arr , int i , int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i = n-2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(nums , 0 , n-1);
        }else{
            for(int i = n-1 ; i >= 0 ; i--){
                if(nums[i] > nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
            reverse(nums , index+1 , n-1);
        }
    }
}