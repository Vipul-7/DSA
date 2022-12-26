package Stack;
import java.util.ArrayList;

public class Stack_using_ArrayList {
    public static class Stack_B{
        // static
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size()==0 ;
        }

        // push operation
        public void PUSH(int data){
           list.add(data);
        }

        // pop operation
        public int POP(){
            if(isEmpty())
            return -1;


            int top = list.get(list.size() -1);
            list.remove(list.size()-1);
            return top ;
        }

        // peek operation
        public int PEEK() {
            if(isEmpty())
            return -1 ;


            return list.get(list.size()-1) ;
        }
    }

    public static void main(String[] args) {
        Stack_B s =new Stack_B();
        s.PUSH(1);
        s.PUSH(2);
        s.PUSH(3);

        while (!s.isEmpty()) {
            System.out.print(s.PEEK()+" ");
            s.POP();
        }
        System.out.println(s.PEEK());
    }
}