package stack;
import java.util.Stack;



public class firstStack {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.empty()){
            s.push(data);
            return;
        }
    
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

       reverse(s);

        while (!s.empty()) {
            System.err.println(s.peek());
            s.pop();
        }
    }
}
