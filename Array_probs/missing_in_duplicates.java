package Array_probs;
import java.util.*;

public class missing_in_duplicates {

    public static void main(String[] args) {
        int nums[]={8,2,1,10,9,4,6,4,5,6};
        //ans 1 to n numbers -> 1,2,3,4,5 but nums{3,2,3,4,5}-> ans {1,4}
        System.out.println(missing_in_arr(nums));
    }
    // indexing marking approach;
    public static List<Integer>  missing_in_arr(int nums[]) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int value = Math.abs(nums[i]);
            int position = value-1;
            if (nums[position]>0) {
                nums[position]= - nums[position];
            }

        }
        for(int i=0;i<nums.length;i++){
            if (nums[i]>0) {
                ans.add(i+1);
            }
        }
        return ans;
    }

    
}