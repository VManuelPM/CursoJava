package com.amoelcodigo.top.interview;

/**
 * Problem 55
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
//        System.out.println(jumpGame.canJump(new int[]{3,2,1,0,4}));
//        System.out.println(jumpGame.canJump(new int[]{0}));
        System.out.println(jumpGame.canJump(new int[]{0,1}));
    }
}
