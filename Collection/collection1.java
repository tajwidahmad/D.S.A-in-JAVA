package Collection;
import java.util.*;

public class collection1 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // System.out.println(list);
        // list.remove(0);
        // System.out.println(list);
        // list.removeAll(list);
        // System.out.println(list);
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(7);
        al.add(2);
        al.add(10);
        //printing the list
        System.out.println("before sort"+ al);
        Collections.sort(al);
        System.out.println("after sort"+ al);
        // shallow copy and deep copy in java collections
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(20);
        System.out.println(marks.isEmpty());
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            int  i  = it.next();
        }
        System.out.println(al);

    }
}
