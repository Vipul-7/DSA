package Tries;

public class Basic {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false ;
        
        Node(){
            for (int i = 0; i < 26; i++) {
                children[i] = null ;
            }
        }
    }

    public static Node root ;

    public static void main(String[] args) {
        String words[] = {"the","a","there","their","any","thee"};

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(Search_in_trie("there"));
    }

    public static void insert(String word){ // time comp -> O(L) l means largest word length
        Node curr = root ; // root is current node
        
        
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){ // pehle se null he to new Node 
               curr.children[idx] = new Node();
            }

            curr = curr.children[idx]; // now children is current
        }

        curr.eow = true ;
    }
   
    // search a string in trie
    public static boolean Search_in_trie(String key){
        Node curr = root ;

        for(int level=0 ; level < key.length() ; level++){
            int idx = key.charAt(level)-'a';

            if(curr.children[idx] == null)
            return false ;

            curr = curr.children[idx];
        }

        return curr.eow == true; 
    }
    
}
