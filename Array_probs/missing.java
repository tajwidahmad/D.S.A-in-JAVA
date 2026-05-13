package Array_probs;

public class missing {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4};
        System.out.println(missing_in_arr(arr));
        
    }
    public static int missing_in_arr(int arr[]) {
        int n = arr.length;
        int xor_sum = 0;
        for(int i=0;i<n;i++){
            xor_sum=xor_sum^arr[i];
        }
        for(int j=0;j<=n;j++){
            xor_sum=xor_sum^j;
        }
        return xor_sum;
    }
}
