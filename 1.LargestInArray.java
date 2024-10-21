import java.util.*;
public class LargestInArray {
    public static void main(String[] args) {
        int [] arr = {3 , 2 , 1 , 5 , 2};
        //  B R U T E - F O R C E      A P P R O A C H    
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-1]);
        // Time Compplexity --> O(nlogn)
        //Space Complexity  --> o(n)


        // There is no better Approach then this so we are doing Optimal Approach


        // O P T I M A L      A P P R O A C H
        int largest = arr[0];
        for(int ele : arr){
            if (largest < ele) largest = ele ;
        }
        System.out.println(largest);
        //TIme Complexity --> O(n)
    }
}
