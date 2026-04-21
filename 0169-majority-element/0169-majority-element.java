class Solution {
    public int majorityElement(int[] arr) {
        int ele = 0 ;
        int count = 0;
        for(int i = 0 ; i < arr.length ;i++){
            if(count == 0){
                count = 1;
                ele = arr[i];
            }else if(arr[i] == ele){
                count++;
            }else{
                count--;
            }
        }
        int count1 = 0;
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] == ele) count1++;
        }
        if(count1 > (arr.length/2)) return ele;
        return -1;
    }
}