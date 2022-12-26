package Backtracking;

public class N_Queens {
    public static void main(String[] args) {
        int n = 4 ;
        char board[][] = new char[n][n] ;
        for(int i=0 ; i < board.length ; i++ ){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = '.' ;
            }
        }
        nQueen(board, 0);
    }

    public static void nQueen(char board[][] , int row) {
        // base case
        if(row == board.length){
            Print(board);
            return ;
        }

        // recursion
        for(int j = 0 ; j < board.length ; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q' ;
                nQueen(board, row+1);
                board[row][j] = 'x' ;
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // for queen rule is that thier vertically up , diagonally left up , diagonally right up don't have any quenn

        // verical up
        for(int i = row-1 ; i >= 0 ; i--){
            if(board[i][col] == 'Q')
            return false;
        }

        // diagonally left up
        for(int i = row-1 , j = col-1 ; i >= 0 && j >= 0 ; i--,j--){
            if(board[i][j] == 'Q')
            return false;
        }

        // diagonally right up
        for(int i = row-1 , j = col+1 ; i >= 0 && j < board.length ; i--,j++){
            if(board[i][j] == 'Q')
            return false;
        }
        return true ;
    }

    public static void Print(char board[][]) {
        System.out.println("------Chess Board------");
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    } 
}
