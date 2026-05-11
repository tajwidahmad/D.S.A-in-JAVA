package Collection;
import java.util.*;

public class Hashmapbasics {

    public static void main(String[] args) {
        // HashMap<String, String> hp= new HashMap<>();
        // hp.put("in", "India");
        // hp.put("us", "USA");
        // hp.put("aus", "Australia");
        // System.out.println(hp);
        int arr[]={1,1,2,2,3,3,3,4,4,5,5,5,5,5,5};
        // System.out.println(max_freq(arr));
        System.out.println(min_freq(arr));

        
    }
    public static int max_freq(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        // for(int i : hm.keySet()){
        //     System.out.println(i+" -> "+hm.get(i));
        // }
        int maxfreq =-1;
        int maxfreqwalikey =-1;
        for(int i: hm.keySet()){
            int crr_key = i;
            int crr_key_freq = hm.get(i);
            if (crr_key_freq>maxfreq) {
                maxfreq = crr_key_freq;
                maxfreqwalikey = crr_key;
            }
        }
        return maxfreqwalikey;
    }
    public static int min_freq(int arr[]) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        int minimum_freq = Integer.MAX_VALUE;
        int minimum_freq_key = 0;
        for(int i:hm.keySet()){
            int curr_freq = i;
            int curr_freq_key = hm.get(i);
            if(curr_freq<minimum_freq){
                minimum_freq=curr_freq;
                minimum_freq_key=curr_freq_key;
            }
        }
        return minimum_freq_key;
    }
}