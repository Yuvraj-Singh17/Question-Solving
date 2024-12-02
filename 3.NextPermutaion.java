public class NextPermutaion{
    public static int[] reverse(int [] arr , int start , int end){
        int i = start;
        int j = end;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[]args) {
        int[]arr = {1 , 2, 3, 4, 5, 6};
        int n = arr.length ;
        int index = -1;
        for(int i = n-2 ; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr , 0 , n-1);
        }else{
            for(int i = n-1 ; i >= 0 ; i--){
                if(arr[i]> arr[index]){
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                    break;
                }
            }
            reverse(arr, index + 1, n - 1);
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
} 
