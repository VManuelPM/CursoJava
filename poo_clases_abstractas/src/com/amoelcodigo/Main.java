package com.amoelcodigo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Tigre tigre = new Tigre(
//                "selva", 2,2,2,"tigreton", "tigre blanco");
//        System.out.println("altura " + tigre.getAltura());
//        System.out.println("tigre. = " + tigre.comer());

        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int m = 3;
        int n = 3;

//        int nums1[] = {1};
//        int nums2[] = {};
//        int m = 1;
//        int n = 0;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
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
