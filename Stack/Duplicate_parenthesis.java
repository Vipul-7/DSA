package Stack;
import java.util.Stack;

class Duplicate_parenthesis {
    public static void main(String[] args) {
        String str = "(a+b)" ; // false - means duplicate not available
        String str2 = "((a+b))" ; // true - means duplicate available

        System.out.println(dup_paren(str));
        System.out.println(dup_paren(str2));

    }

    public static boolean dup_paren(String str){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing condition
            if(ch==')'){
                int count = 0 ;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++ ;
                }

                if(count < 1){
                    return true ; // means dplicate
                }
                else{
                    s.pop() ;
                }
            }
            // opening condition
            else{
                s.push(ch) ; // just push (  on the stack
            }

        }

        return false ;
    }
}