package Array_probs;

public class sort_zero_one {

    public static void main(String[] args) {
        int arr[] ={0,1,0,1,0,1};
        sort_arr(arr);
        printarr(arr);
    }
    public static void sort_arr(int arr[]) {
        int start =0;
        int end = arr.length-1;
        while(start<end){
            if (arr[start]==0 && arr[end]==1) {
                //swap
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
            if (arr[start]==0) {
                start++;
            }
            if (arr[end]==1) {
                end--;
            }
        }
        
    }
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}