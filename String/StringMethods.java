import java.util.Scanner;
public class StringMethods {
    public static void main(String [] args){

        //System.out.println("I started java from today");
        //System.out.println("I will learn java daily and  will maintain consistancy :)");

        // for the ask string from the user
        Scanner vips = new Scanner(System.in);
        System.out.println("Enter the name:");
        String Name = vips.nextLine();               //  .nextLine() used for printing the string about more than one word
        System.out.println("Your name is "+Name);

    //String method for find the number of the character in string
        int value = Name.length();
        System.out.println("Length of the string is:"+value);


    //for printing the followoing string into the all lowercase character
        String sc = Name.toLowerCase();
        System.out.println("upper case of following string is :"+ sc);


    //for printing the followoing string into the all lowercase character

        String dc = Name.toUpperCase();
        System.out.println("upper case of following string is :"+dc);

    //to trim the string means space remove.
        String TrimStr = Name.trim();
        System.out.println("non trimmed string is:"+TrimStr);

    // for print the sub string of the main string
        String ss = Name.substring(1);
        System.out.println("Sub-string of the given string is:"+ss);

    // For print the string in start the string is included & end the string is excluded
        String sse = Name.substring(0,2);
        System.out.println("Sub-string of the given string is:"+sse);

    // Replace the chaaracter in the string use 'one char' & "2 or more "
        System.out.println("Replaced string is:"+Name.replace("el","ep"));

    // Check the string is true or false
        System.out.println(Name.startsWith("pa"));
        System.out.println(Name.endsWith("rp"));

    // charecter at index 'x' print char on index x
        System.out.println("Character at given index is:"+Name.charAt(2));

    // find index using string or character
        System.out.println("index of given character is:"+Name.indexOf('a'));
        System.out.println("Index of starting index this then character is:"+Name.indexOf('t', 2));

    // find index but starting with last
        System.out.println("last index:"+Name.lastIndexOf('e'));
        System.out.println("last index:"+Name.lastIndexOf("arry",10));

    // check string is equal or not
        System.out.println(Name.equals("patel"));
        System.out.println(Name.equalsIgnoreCase("PaTEl"));
    }
}