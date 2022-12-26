public class spiral_matrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int start_row = 0 ;
        int end_row = arr.length - 1 ;
        int start_col = 0 ;
        int end_col = arr[0].length - 1 ;

        while (start_row <= end_row && start_col <= end_col) {
            
            // starting row
            for(int j = start_col ; j <= end_col ; j++){
                System.out.println(arr[start_row][j]+" ");
            }
            
            // ending coloumn
            for(int i = start_row+1 ; i <= end_row ; i++){
                System.out.println(arr[i][end_col]+" ");
            }

            // ending row
            for(int j = end_col-1 ; j >= start_col ; j--){

                // for not print the same value in n*m(odd) case
                if(start_row == end_row)                     
                break;

                System.out.println(arr[end_row][j]+" ");
            }

            // starting coloumn
            for(int i = end_row - 1 ; i >= start_row+1  ; i--){

                // for not print the same value in n*m(odd) case
                if(start_col == end_col)
                break;
                
                System.out.println(arr[i][start_col]+" ");
            }
            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
    }
}
