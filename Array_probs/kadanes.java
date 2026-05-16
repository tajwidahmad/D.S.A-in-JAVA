package Array_probs;

public class kadanes {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        // kadanes algo
        int sum=0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max_sum=Math.max(max_sum,sum);
            if (sum<0) {
                sum=0;
            }
            
        }
        System.out.println(max_sum);

    }
}
