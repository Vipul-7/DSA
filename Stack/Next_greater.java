package Stack;
import java.util.Stack;

public class Next_greater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nextG[] = new int[arr.length] ;

        nextGreater(arr,nextG) ;

        for (int i = 0; i < nextG.length; i++) {
            System.out.print(nextG[i]+" ");
        }
    }

    public static void nextGreater(int arr[] , int nextG[]){
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length-1 ; i >= 0 ; i--) {
            // step 1 - while loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop() ;
            }

            // if-else statement
            if(s.isEmpty())
            nextG[i] = -1 ;
 
            else
            nextG[i] = arr[s.peek()];   

            // push the current element
            s.push(i);
        }   
    }
}
