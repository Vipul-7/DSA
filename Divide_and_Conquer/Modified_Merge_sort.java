package Divide_and_Conquer;

import java.util.*;

// 493. Reverse Pairs

/* Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:

0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
*/

// modified mergesort
// time - O(n*logn)+O(n)+O(n)
// space - 
// refrence - striver

public class Modified_Merge_sort {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 3, 1 };
        System.out.println(reversePairs(arr));
    }

    public static int reversePairs(int[] nums) {
        return divide(nums, 0, nums.length - 1);
    }

    public static int divide(int[] nums, int si, int ei) {
        if (si >= ei) {
            return 0;
        }

        int mid = (si + ei) / 2;

        int ans = divide(nums, si, mid);
        ans += divide(nums, mid + 1, ei);

        ans += conquerer(nums, si, ei, mid);

        return ans;
    }

    public static int conquerer(int nums[], int si, int ei, int mid) {
        int count = 0;

        // modified
        int j = mid + 1;
        for (int i = si; i <= mid; i++) {
            while (j <= ei && nums[i] > (2 * (long) nums[j])) {
                j++;
            }
            count += (j - (mid + 1));
        }

        List<Integer> temp = new ArrayList<>();

        int i = si;
        j = mid + 1;

        while (i <= mid && j <= ei) {
            if (nums[i] <= nums[j]) {
                temp.add(nums[i++]);
            } else {
                temp.add(nums[j++]);
            }
        }

        while (i <= mid) {
            temp.add(nums[i++]);
        }
        while (j <= ei) {
            temp.add(nums[j++]);
        }

        // transfer to main array
        for (int idx = si; idx <= ei; idx++) {
            nums[idx] = temp.get(idx - si);
        }

        return count;
    }
}
