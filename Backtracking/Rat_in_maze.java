package Backtracking;



public class Rat_in_maze {
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        Solve_maze(maze);
    }

    // main
    public static boolean Solve_maze(int maze[][]) {
        int N = maze.length ;
        int sol[][] = new int[N][N] ;

        if(Solve_maze_util(maze,0,0,sol) == false)
        System.out.println("Solution not existed !!!!");

        print_sol(sol);

        return true ;
    }

    // recursive function
    public static boolean Solve_maze_util(int maze[][],int x,int y,int sol[][] ) {

        if(x == maze.length-1 && y == maze.length-1 && maze[x][y] == 1){
            sol[x][y] = 1 ;
            return true ;
        }

        // maze[x][y] is valid or not
        if(isSafe(maze, x, y) == true){

            if(sol[x][y] == 1) // chack that cell is not repeat
            return false ;

            sol[x][y] = 1 ; // visit

            if(Solve_maze_util(maze,x+1,y,sol))  // next coloumn
            return true ;

            if(Solve_maze_util(maze,x,y+1,sol)) // next row
            return true ;

            return false;

        }
        return false;

    }

    public static boolean isSafe(int maze[][],int x ,int y) {

        return x >= 0 && x < maze.length && y >=0 && y < maze.length && maze[x][y]==1 ;
    }

    public static void print_sol(int sol[][]) {
        for(int i = 0 ; i < sol.length ; i++){
            for(int j = 0 ; j < sol.length ; j++){
                System.out.print(" " + sol[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
