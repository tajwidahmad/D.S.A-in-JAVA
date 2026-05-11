package Array_probs;
import java.util.*;

public class union {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={9,10,11,12};
        union_of_array(arr1, arr2);
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
}
