package Array_probs;

public class pivot_index {
    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
        System.out.println(leftequalsright(arr));

    }
    public static int leftequalsright(int arr[]) {
          int n= arr.length;
          int left_sum[]= new int[n];
          int right_sum[]= new int[n];
          //left sum wala array fill
        left_sum[0]=arr[0];
        for(int i=1;i<n;i++){
            left_sum[i]=left_sum[i-1]+arr[i];
        }
        right_sum[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right_sum[i]=right_sum[i+1]+arr[i];
        }
        // pivot fining
        for(int i=0;i<n;i++){
            if (left_sum[i]==right_sum[i]) {
                return i;
            }
        }
        return -1;
    }
}
