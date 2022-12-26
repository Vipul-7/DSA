package Stack;

import java.util.Stack;

public class Max_Area_in_Histogram {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };

        System.out.println(max_area(arr));

    }

    public static int max_area(int arr[]) {
        int max = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        // find next smaller right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) { // start from arr.length to 0 and staore which are smaller
            // compartively then others
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty())
                nsr[i] = -1;

            else
                nsr[i] = s.peek();

            s.push(i);
        }

        // find next smaller left
        s = new Stack<>();

        for (int i = 0; i < arr.length; i++) { // start from o to end and store the element which most smaller in stack
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty())
                nsl[i] = -1;

            else
                nsl[i] = s.peek();

            s.push(i);
        }

        // find cuurrent area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;

            int currArea = height * width;
            max = Math.max(currArea, max);
        }

        return max;
    }
}
