package Array_probs;

public class average {
    // finding the average of the array
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        // System.out.println(cal_avg(arr));
        // mul_by_ten(arr);
        // print_array(arr);
        // System.out.println(max_in_arr(arr));
        // int pos_sum=0;
        // int neg_sum=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>0){
        //         pos_sum+=arr[i];
        //     }
        //     else{
        //         neg_sum+=arr[i];
        //     }
        // }
        
        // System.out.print("postivie sum will be "+pos_sum);
        // System.out.println();
        // System.out.print("negative sum will be "+neg_sum);
        // int[] arr2= {1,0,1,0,1,0};
        // int count_zero =0;
        // int count_one=0;
        // for(int i=0;i<arr2.length;i++){
        //     if (arr2[i]==1) {
        //         count_one++;

        //     }
        //     else{
        //         count_zero++;
        //     }
            
        // }
        // System.out.print("Number of Zeros in the array is "+ count_zero);
        // System.out.println();
        // System.out.print("Number of Ones in the array is "+ count_one);
        // System.out.println("the first unsorted element in your array is "+ first_unsorted(arr));
        // swap_alternately(arr);
        // print_array(arr);
        // alternate_extreme(arr);
        // reverse_arr(arr);
        // print_array(arr);
        shift_by_one(arr);
        print_array(arr);


    }
    public static double cal_avg(int arr[]) {
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        return sum/arr.length;
    }
    public static void mul_by_ten(int arr[]) {
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*10;
        }
    }
    public static void print_array(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int max_in_arr(int arr[]) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int first_unsorted(int arr[]) {
        for(int i=0;i<arr.length;i++){
            if (arr[i+1]<arr[i]) {
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void swap_alternately(int arr[]) {
        int temp=0;
        for(int i=0;i<arr.length-1;i=i+2){
            temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void alternate_extreme(int arr[]) {
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            System.out.print(arr[start]+" ");
            System.out.print(" ");
            System.out.print(" "+arr[end]);
            start++;
            end--;

        }
    }
    public static void reverse_arr(int arr[]) {
        int start=0;
        int end= arr.length-1;
        int temp=0;
        while(start<=end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void shift_by_one(int arr[]) {
        int last = arr[arr.length-1];
        for(int  i= arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;

    }
}
