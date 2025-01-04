package com.amoelcodigo.top.interview;

import java.util.Arrays;

/**
 * Problem 88
 * https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */

public class MergeSortArray {

    //Best solution
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    //Solution VManuelPM
    public static void mergeMyLogic(int[] nums1, int m, int[] nums2, int n) {
        int[] copy3 = new int[m + n];

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (nums1[count] != 0) {
                copy3[i] = nums1[count];
            }
            count++;
        }

        for (int j = 0; j < n; j++) {
            if (nums2[j] != 0) {
                copy3[count] = nums2[j];
            }
            count++;
        }

        for (int i = 0; i < copy3.length; i++) {
            nums1[i] = copy3[i];
        }


        Arrays.sort(nums1);

        for (int nums : nums1) {
            System.out.print(nums + ",");
        }

    }
}
