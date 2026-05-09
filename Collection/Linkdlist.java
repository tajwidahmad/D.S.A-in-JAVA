package Collection;
import java.util.*;

public class Linkdlist {
    public static void main(String[] args) {
       LinkedList<Integer> l1 = new LinkedList<>();
       l1.add(100);
       l1.add(60);
       l1.add(70);
       l1.add(200);
    //    System.out.println("List: "+l1);
       l1.addFirst(900);
       l1.addLast(1000);
    //    System.out.println("after additoon "+l1);
    Iterator<Integer> it = l1.iterator();
    while (it.hasNext()) {
        int i = it.next();
        if (i>=200) {
            it.remove();
        }
    }
    }
}
