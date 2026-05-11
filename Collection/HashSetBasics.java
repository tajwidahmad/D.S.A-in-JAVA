package Collection;
import java.util.*;

public class HashSetBasics {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        System.out.println(st);
        // Iterator<Integer> it = st.iterator();
        // while (it.hasNext()) {
        //     int i = it.next();
        // }
        Set<Integer> lst = new LinkedHashSet<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        System.out.println(lst);
        Set<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(2);
        ts.add(6);
        System.out.println(ts);
       

    }
}
