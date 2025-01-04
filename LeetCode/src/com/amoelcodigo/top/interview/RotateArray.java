package com.amoelcodigo.top.interview;

import java.util.Arrays;

/**
 * Problem 189
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);  // reverse the whole array
        reverse(nums, 0, k-1);  // reverse the first part
        reverse(nums, k, nums.length-1);  // reverse the second part
    }

    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = tmp;
        }
    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
      //  ra.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        //ra.rotate(new int[]{-1}, 2);
       ra.rotate(new int[]{1,2}, 3);
    }
}
