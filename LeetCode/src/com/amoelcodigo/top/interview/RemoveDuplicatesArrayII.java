package com.amoelcodigo.top.interview;

public class RemoveDuplicatesArrayII {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        System.gc();
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicatesArrayII removeDuplicatesArrayII = new RemoveDuplicatesArrayII();
      //  System.out.println(removeDuplicatesArrayII.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
        System.out.println
                (removeDuplicatesArrayII.removeDuplicates
                        (new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }
}
