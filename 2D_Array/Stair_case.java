public class Stair_case {
    public static void main(String[] args) {
        int arr[][] = { { 21, 22, 23, 24 },
                { 25, 26, 27, 28 },
                { 29, 30, 31, 32 },
                { 33, 34, 35, 36 } };
        Stair_case_for_topRightCorner(arr);
        Stair_case_for_bottomLeftCorner(arr);

    }

// time complexity of this is o(n+m)
    public static boolean Stair_case_for_topRightCorner(int arr[][]) {
        int key = 31;
        int row = 0, col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {

            if (arr[row][col] == key) {
                System.out.println("(" + row + "," + col + ")");
                return true;
            } else if (key < arr[row][col])
                col--;

            else 
                row++;
        }
        return false ;

    }

    public static boolean Stair_case_for_bottomLeftCorner(int arr[][]){
        int key = 22;
        int row = arr.length-1;
        int col = 0;

        while (col < arr.length && row >=0) {

            if(arr[row][col]==key){
            System.out.println("("+row+","+col+")");
            return true ;
            }

            else if(key < arr[row][col]){
                row --;
            }

            else
            col ++ ;
        }
        return false;

    }
}
