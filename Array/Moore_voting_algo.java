import java.util.*;

// [1]

/* 169. Majority Element
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.*/

// [2]

// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

//

public class Moore_voting_algo {
    public static void main(String[] args) {
        System.out.println(majorityElementNby2Times(new int[] { 2, 2, 1, 1, 1, 2, 2 }));

        List<Integer> temp = majorityElementNby3Times(new int[] { 1, 2 });

        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i) + " ");
        }
    }

    public static int majorityElementNby2Times(int[] nums) {
        int n = nums.length;

        /*
         * step -1 apply algo
         * take element (hypothetically assumpation) if count = 0 and continue
         * if current == element then count++ else count--
         * if in array some point count became 0 then leave that element take new which
         * is current
         * at last point we will get element which is majority element
         * to verify that traverse throw array and check if that element appears more
         * than n/2
         */
        int element = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                element = nums[i];
                count = 1;
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        // step -2 verfiy answer through iteration over array
        int verCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element) {
                verCount++;
            }
        }

        return verCount > n / 2 ? element : -1;
    }

    // just like the n/2 times majority element but here we have to element which
    // appear more than ⌊ n/3 ⌋ times
    // there would be atmost 2 elements which appear more than n/3 times
    public static List<Integer> majorityElementNby3Times(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        int num1 = -1;
        int num2 = -1;

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            int ele = nums[i];

            if (ele == num1) {
                count1++;
            } else if (ele == num2) {
                count2++;
            } else if (count1 == 0) {
                num1 = ele;
                count1 = 1;
            } else if (count2 == 0) {
                num2 = ele;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == num1) {
                c1++;
            } else if (nums[i] == num2) {
                c2++;
            }
        }

        if (c1 > n / 3) {
            ans.add(num1);
        }
        if (c2 > n / 3) {
            ans.add(num2);
        }

        return ans;
    }
}
