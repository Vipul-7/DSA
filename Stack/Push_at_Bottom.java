package Stack;
import java.util.Stack ;

public class Push_at_Bottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, 0);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> s,int data){
        if (s.isEmpty()) {
            s.push(data) ;
            return ;
        }

        int top = s.pop() ; // first remove all element of the stack
        pushAtBottom(s, data); // then recrsively call function
        s.push(top) ;  // after pushing the our data , push all element that has been removed
    }
}
