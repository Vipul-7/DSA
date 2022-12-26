import java.util.*;
public class pra_con4_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your income lakhs:");
        float incm = in.nextFloat();

        double tax = 0 ;
        if(incm <= 2.5f){
            tax = tax + 0 ;
        }
        else if(incm > 2.5f && incm <= 5.0f){
            tax =  tax + 0.05f * (incm - 2.5);

        }
        else if(incm > 5.0f && incm <= 10.0f){
            tax =  tax + 0.05f * (5.0f - 2.5f);
            tax =  tax + 0.2f * (incm - 5.0f);
        }
        else if(incm > 10.0f){
            tax =  tax + 0.05f * (5.0f - 2.5f);
            tax =  tax + 0.2f * (10.0f - 5.0f);
            tax =  tax + 0.3f * (incm - 10.0f);
        }
        System.out.println("Tax of on your income is:"+tax+"% from the income");
    }
}