import java.util.Scanner;

public class codeF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a[] =new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] =sc.nextInt();
        }

        k = k-1 ;
        int count =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] >= a[k] && a[i] > 0)
            count++;
        }
        System.out.println(count);
    }

    
}
