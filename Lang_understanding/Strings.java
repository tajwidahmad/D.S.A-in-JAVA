
package Lang_understanding;
import java.util.*;

public class Strings {

    public static void main(String[] args) {
        // String str = new String("tajwid ahmad");
        // System.out.println(str);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("please enter your name.");
        // String name = sc.nextLine();
        // System.out.println("name entered by you is: "+name);
        // String str = "tajwidahmad";
        // System.out.println(str.isEmpty());
        // char[] alphas= str.toCharArray();
        // System.out.println(alphas);
        // System.out.println(alphas[5]);
        // for(int i=0;i<alphas.length;i++){
        //     System.out.print(alphas[i]+" ");
        // }
        // String str2= "My name is tajwid ahmad";
        // String[] words=str2.split( " ");
        // for(int i=0;i<words.length;i++){
        //     System.out.println(words[i]);
        // }
        String str= "noon";
        // System.out.println(count_vowels(str));
        // System.out.println(reverse(str));
        System.out.println(isplaindrome(str));
        
        


    }
    public static int count_vowels(String str) {
        int count =0;
        for(int i=0;i<str.length();i++){
            if ((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')) {
                count++;
            }
        }
        return count;
        
    }
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static boolean isplaindrome(String str) {
        if (str.equals(reverse(str))) {
            return true;
        }
        return false;
    }
   
}