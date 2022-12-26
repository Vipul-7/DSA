import java.util.*;
public class two_array {
    public static void main(String[] args) {
        teo() ;
    }
    public static void teo() {
        int matrix[][] = new int[3][3];
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                matrix[i][j] = sc.nextInt() ;
            }
        }
        
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] > max){
                max = matrix[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
