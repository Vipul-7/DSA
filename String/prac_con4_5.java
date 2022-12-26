import java.util.*;
public class prac_con4_5 {
    public static void main(String[] args) {
        Scanner vj = new Scanner(System.in);

        System.out.print("Enter the url :");
        String url = vj.next();

        if(url.endsWith(".com")){
            System.out.println("This is commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("This is an Organizational  website");
        }
        else if(url.endsWith(".in")){
            System.out.println("This is an indian website");
        }

    }
}
