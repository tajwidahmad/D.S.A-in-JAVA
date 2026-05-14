package Array_probs;
import java.util.*;

public class first_repeating {

    public static void main(String[] args) {
        int arr[]={2,3,4,1,6,6,4,3,5};
        System.out.println(repeat(arr));
    }
    public static int repeat(int arr[]) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i: arr){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(int i : arr){
            if (hm.get(i)>1) {
                return i;
            }
        }     
        return -1;
    }
}  