package Array_probs;

public class Shift_by_k {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k=3;
        // imp please note it why k = k%n;
        k = k%arr.length;
        // reverse the whole array
        reverse_arr(arr, 0, arr.length-1);
        // reverse first k elements
        reverse_arr(arr, 0, k-1);
        // reverse rest of array from k
        reverse_arr(arr, k, arr.length-1);
        printarr(arr);
        
        
    }
    public static void reverse_arr(int arr[], int start, int end) {
        
        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
