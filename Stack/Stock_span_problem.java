package Stack;
import java.util.Stack;

public class Stock_span_problem {
    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100} ;
        int span[] = new int[stock.length];
        stockSpan(stock,span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");
        }
    }

    public static void stockSpan(int stock[],int span[]){
        Stack<Integer> s= new Stack<>() ;
        span[0] = 1 ; // oth element value will be always 1
        s.push(0) ; // then push into our stack

        for(int i=1 ; i<stock.length ; i++){
            int currPrice = stock[i] ;

            while (currPrice > stock[s.peek()] && !s.isEmpty()) {
                s.pop();
            }

            if(s.isEmpty()){
                span[i] = i+1 ; // take one plus on current index
            }
            else{
                span[i] = i - s.peek() ;   // s.peek() is previuos hieght
            }

            s.push(i) ; // push the index of the stock array
        }
    }
}
