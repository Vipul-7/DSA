package Tries;

public class Word_break_prob {
    public static void main(String[] args) {
        String arr[] = {"i","like","samsung","sam","maio"};
        word_break("ilikesamsungmo");
    }

    public static boolean word_break(String key){ // O(L) -> length of key
        if(key.length() == 0)
        return true ;

        for(int i=1 ; i<= key.length() ; i++){
            if(search(key.substring(0,i)) && word_break(key.substring(i)))
            return true; 
        }

        return false ;
    }
   
}
