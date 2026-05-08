package Collection;
import java.util.*;

public class collection1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.removeAll(list);
        System.out.println(list);


    }
}
