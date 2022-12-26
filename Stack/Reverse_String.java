package Stack;
import java.util.Stack ;

public class Reverse_String {
    public static String rs(String s){
        Stack<Character> stack = new Stack<>();

        int index = 0 ;
        while (index < s.length()) {
            stack.push(s.charAt(index));
            index++ ;
        }

        StringBuilder result = new StringBuilder("");
        while (!stack.isEmpty()) {
            char temp = stack.pop() ;
            result.append(temp) ;
        }
        
        return result.toString() ;
    }

    public static void main(String[] args) {
        System.out.println(rs("Vipul"));   
    }
}    
