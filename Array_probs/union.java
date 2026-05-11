package Array_probs;
import java.util.*;

public class union {
    public static void main(String[] args) {
        int arr1[]={1,2,2,4,5,6,8};
        int arr2[]={9,11,11,12};
        // union_of_array(arr1, arr2);
        union_using_hashset(arr1, arr2);
    }
    public static void union_of_array(int arr1[], int arr2[]) {
        ArrayList <Integer> al = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            al.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            al.add(arr2[j]);
        }
        // al.toArray();
        // System.out.println("the union of the array : "+ al);
        // System.out.println(al.toArray());
        Object[] final_arr = al.toArray();
        for(Object i : final_arr){
            System.out.print(i + " ");

        }
    }
    public static void union_using_hashset(int arr1[], int arr2[]) {
        HashSet <Integer> hs = new HashSet<>();
        for(int i : arr1){
            hs.add(i);
        }
        for(int j: arr2){
            hs.add(j);
        }
        System.out.println(hs);
    }
}
