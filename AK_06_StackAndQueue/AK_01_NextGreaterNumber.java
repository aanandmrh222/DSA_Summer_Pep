package AK_06_StackAndQueue;
import java.util.ArrayList;
import java.util.Stack;

public class AK_01_NextGreaterNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(10);

    }

    static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> list) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i=list.size()-1; i>=0; i--) {
            int curr = list.get(i);

            while(!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            if(st.isEmpty()) {
                res.add(-1);
            } else {
                res.add(st.peek());
            }
            st.push(curr);
        }

        return res;
    }
}
