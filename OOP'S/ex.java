import java.util.*;;
public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=2 ;
        int b=3 ; 
        Complex c = new Complex();
        System.out.println(c.Sum(a,b));
        System.out.println(c.Difference(a,b));
        System.out.println(c.Product(a,b));
    }
}
class Complex{
    
    int Sum(int a ,int b){
        return a+b ;
    }
    int Difference(int a ,int b){
        return a-b ;
    }
    int Product(int a ,int b){
        return a*b ;
    }
}