public class Assign_Array {
    public static void main(String[] args) {
        int arr[] = {7,1,3,5,6,2 };
        //System.out.println(twice_or_not(arr));
        

    }

    // check in the array vlaue is twice or not
    public static boolean twice_or_not(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    
}
