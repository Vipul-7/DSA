package Backtracking;

public class Keypad_combination {

    final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','c'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public static void main(String[] args) {
        letter_com("2");
    }

    public static void letter_com(String D) {
        int len = D.length();
        if(len == 0){
        System.out.println("");
        return ;
        }
        bfs(D, 0, len, new StringBuilder());
    }


    public static void bfs(String D,int pos ,int len ,StringBuilder sb) {
        if(pos == len)
        System.out.println(sb.toString());

        else{
            char[] letters = L[Character.getNumericValue(D.charAt(pos))] ;
            
            for(int i = 0 ; i < letters.length ; i++)
            bfs(D, pos+1, len, sb.append(letters[i]));
        }
    }
}
