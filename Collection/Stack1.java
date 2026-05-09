package Collection;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.add(200);
        s1.add(300);
        s1.add(150);
        s1.add(100);
        System.out.println(s1);
        s1.push(1000);
        s1.push(2000);
        s1.pop();
        s1.peek();
        System.out.println(s1);
        System.out.println(s1.search(1000));
        


    }
}
