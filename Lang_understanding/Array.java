package Lang_understanding;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6};
        // System.out.println(arr.length);
        // ranks ={ 1,2,3,4,5,6,7,8,9,10};
        // input value as n and return the nth largest and nth smallest numbers from the array
        int[] rank={1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.print("please give the input : ");
        int n = sc.nextInt();
        if (n<1 || n>10) {
            System.out.println("inavlid input");
        }
        System.out.print("minimum nth rank is" + rank[n-1]);
        System.out.println();
        System.out.print("maximum nth rank is" + rank[rank.length-n]);
    }
}
