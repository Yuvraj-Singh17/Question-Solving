import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = { 1 , 2 , 4 , 7 , 7 , 5};
        // B R U T E        A P P R O A C H
        // Arrays.sort(arr);
        // int ans = -1;
        // int n = arr.length;
        // int largest = arr[n-1];
        // for(int  i = n - 2 ; i >= 0  ; i--){
        //     if(arr[i] != largest){
        //         ans = arr[i];
        //         break;
        //     }
        // }
        // System.out.println(ans);
        
        //Time Complexity --> O(n)


        // B E T T E R       A P P R O A C H
        
        // int largest = arr[0];
        // for(int ele : arr){
        //     if(largest < ele){
        //         largest = ele ;
        //     }
        // }
        // int SecondLargest = -1;
        // for(int ele : arr){
        //     if(ele > SecondLargest && ele < largest){
        //         SecondLargest = ele;
        //     }
        // }
        // System.out.println(SecondLargest);

        //Time Complexity - o(2n)

        


        // O P T I M A L       A P P R O A C H
        int largest = arr[0];
        int SecondLargest = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > largest){
                SecondLargest = largest;
                largest = i;
            }else if(i < largest && i > SecondLargest){
                SecondLargest = i;
            }
        }
        System.out.println(SecondLargest);
        //Time Complexity
    }
}
