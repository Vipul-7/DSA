import java.util.Arrays;
import java.util.Scanner;

public class string_problems {
    public static void main(String[] args) {
        
        System.out.println(palinfdrome());
        System.out.println(Shortest_path());

        compare();
        System.out.println(toUppercase());
        str_compression();
        System.out.println(vowels_count());
        anagram();
    }

    public static boolean palinfdrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        for(int i=0; i < name.length()/2; i++){
            if(name.charAt(i) != name.charAt(name.length()-1-i))
            return false;
          }
        return true;
    }


    // shortest path in direction graph
    public static float Shortest_path() {
        String pc = "WNEENESENNN";
        int x= 0 ;
        int y = 0 ;
        for(int i = 0 ; i < pc.length() ; i++){
            if(pc.charAt(i)=='W')
            x -= 1 ;
            else if(pc.charAt(i)=='N')
            y += 1 ;
            else if(pc.charAt(i)=='E')
            x += 1 ;
            else if(pc.charAt(i)=='S')
            y -= 1 ;
        }

        int x2 = x*x ;
        int y2 = y*y ;

        return (float)Math.sqrt(x2+y2); // eqaution of finding shortest path is sqrt((x2-x1)2+(y2-y1)2) but x1 and y1 is o then x2+x1

    }


    // compare function for finding which string is largest
    public static void compare() {
        String str[] = {"Amit","Vipul","kavita","Dimple"};
        String large = str[0];
        for(int i = 1; i <str.length ; i++){
            if(large.compareToIgnoreCase(str[i])  < 0)
            large = str[i] ;

        }
        System.out.println(large);

    }


    // convert evry word's first character uppercase
    public static String toUppercase(){
        String str = "my self vipul chaudhary" ;
        StringBuilder sb = new StringBuilder("") ;

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ' ' && i < str.length() -1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else 
            sb.append(str.charAt(i));

        }
        return sb.toString();
    } 

    //string compresssion
    public static void str_compression(){
        String str = "abbbccddddddee";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < str.length() ; i++){
            int count = 1 ;

           while (i < str.length()-1  && str.charAt(i) == str.charAt(i+1)) {
            i++;
            count++;
           }
           sb.append(str.charAt(i));
           if(count > 1)
           sb.append(count);          
    }
     System.out.println(sb.toString());
    }

    // (Exercise )Find vowels in the given string
    public static int vowels_count(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string for find vowels-");
        String vo = sc.nextLine();

        int count = 0 ;
        for(int i = 0 ; i < vo.length() ; i++){
            if(vo.charAt(i) == 'a' || vo.charAt(i) == 'e' || vo.charAt(i) == 'i' || vo.charAt(i) == 'o' || vo.charAt(i) == 'u'){
                count++;
            }
        }
        return count ;
    }


    //(Exercise) chexk two string is anagram or not
    public static void anagram() {
        String str1 = "race" ;
        String str2 = "care" ;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
                   
            char str1CharArray[] = str1.toCharArray() ; // to convert into character array
            char str2CharArray[] = str2.toCharArray() ;

            Arrays.sort(str1CharArray);  // then sort this array
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray, str2CharArray); //  check both array's equal or not and store in the result
            if(result){ // if true then print 
                System.out.println(str1 + " and " + str2 +" are anagram :)");
            }
            else
            System.out.println(str1 + " and " + str2 +" are not anagram");

        }

        else 
        System.out.println(str1 + " and " + str2 +" are not anagram");
        
    }
}
