class Solution {
    public int maxProduct(int[] arr) {
        int pro1 = 1;
        int pro2 = 1;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ;i++){
            pro1 *= arr[i];
            max1 = Math.max(max1 , pro1);
            if(pro1 == 0) pro1 = 1;
        }
        for(int i = arr.length - 1 ; i >= 0; i--){
            pro2 *= arr[i];
            max2 = Math.max(max2 , pro2);
            if(pro2 == 0) pro2 = 1;
        }
        return Math.max(max1,max2);
    }
}