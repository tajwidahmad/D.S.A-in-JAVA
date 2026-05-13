package Array_probs;

public class zero_one_two_sort {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,2};
        sort_arr(arr);
        printarr(arr);
    }
    public static void sort_arr(int arr[]) {
        int start=0;
        int mid=0;
        int end = arr.length-1;
        while(mid<=end){
            if (arr[mid]==0) {
                //swap
                int temp=arr[start];
                arr[start]=arr[mid];
                arr[mid]=temp;
                start++;
                mid++;
            }
            else if (arr[mid]==1) {
                mid++;
            }
            else{// arr[mid] ==2;
                int temp = arr[mid];
                arr[mid]=arr[end];
                arr[end]= temp;
                end--;


            }
        }


    }
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
