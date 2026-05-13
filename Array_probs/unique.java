package Array_probs;

public class unique {
    public static void main(String[] args) {
        int arr[]={2,2,3,4,3,6,6};
        System.out.println(unique_in_arr(arr));
        
    }
    public static int unique_in_arr(int arr[]) {
        int xor_sum=0;
        for(int i=0;i<arr.length;i++){
            xor_sum^=arr[i];
        }
        return xor_sum;
    }
}
