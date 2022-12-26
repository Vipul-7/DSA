package Recursion;

public class tiling_problem {
    public static void main(String[] args) {
        System.out.println(tiles(8));
    }

    public static int tiles(int n) {
        if(n == 0 | n ==1 ){
            return 1 ;
        }
        // n-1 for vertical set the tiles
        // n-2 for horizontial set the tiles
        // total of this will give us total ways of set the tiles
        return tiles(n-1)+tiles(n-2);
    }
}
