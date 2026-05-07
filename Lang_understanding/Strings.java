
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
        String str = "tajwidahmad";
        // System.out.println(str.isEmpty());
        // char[] alphas= str.toCharArray();
        // System.out.println(alphas);
        // System.out.println(alphas[5]);
        // for(int i=0;i<alphas.length;i++){
        //     System.out.print(alphas[i]+" ");
        // }
        String str2= "My name is tajwid ahmad";
        String[] words=str2.split( " ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }

    }
}