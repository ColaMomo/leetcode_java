package com.kolamomo.leetcode;

/**
 * Climbing Stairs
 *
 * <p>You are climbing a stair case. It takes n steps to reach to the top.<br>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?<br>
 *
 *     @author jiangchao
 */
public class Ex70 {
    public int climbStairs(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        int n1 = 1;
        int n2 = 2;
        int result = 0;
        for(int i = 3; i <= n; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }
        return result;
    }
}
