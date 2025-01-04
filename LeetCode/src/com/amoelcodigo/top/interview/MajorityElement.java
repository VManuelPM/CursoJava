package com.amoelcodigo.top.interview;

import java.util.Arrays;

/**
 * problem 169
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    public static void main(String[] args) {
        int nums[] = {3,3,4};
        int nums2[] = {2,2,1,1,1,2,2,5};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums2));
    }
}
