package Stack;
import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // opening bracket
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch) ;
            }

            // closing bracket
            else{
                if(s.isEmpty())
                return false ;

                if((s.peek()=='(' && ch==')' ) || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']')){
                    s.pop() ;
                }
                else
                return false ;
            }
        }

        if(s.isEmpty())
        return true ;
        else
        return false;
       
    }
    
}
