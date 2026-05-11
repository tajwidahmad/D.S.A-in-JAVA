package Array_probs;

public class part_two {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        // sol -> 162534
        // extreme_elements(arr);
        count_freq(arr);



    }
    public static void print_array(int arr[]) {
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
    public static void extreme_elements(int arr[]) {
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            System.out.println(arr[start]);
            System.out.println(arr[end]);
            start++;
            end--;
        }
    }
    public static void count_freq(int arr[]) {
        int[] count = new int[arr.length];
        //iterator for count array
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //iterate on count array
        int max=arr[0];
        for(int i=1;i<count.length;i++){
            if (arr[i]>max) {
                max= arr[i];
            }

        }
        System.out.println(max);
    }
}
