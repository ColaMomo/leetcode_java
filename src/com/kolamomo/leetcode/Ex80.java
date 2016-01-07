package com.kolamomo.leetcode;

/**
 * Remove Duplicates from Sorted Array II
 *
 * <p>Follow up for "Remove Duplicates": <br>
 * What if duplicates are allowed at most twice? <br> <br>
 *
 * For example, <br>
 * Given sorted array nums = [1,1,1,2,2,3], <br>
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. <br>
 * It doesn't matter what you leave beyond the new length. <br>
 *
 *     @author jiangchao
 */
public class Ex80 {
    public int removeDuplicates(int[] nums) {
        int count = 0;

        int index = 0;
        int length = nums.length;
        while(index < length) {
            int tag = 0;
            for(int i = index+1; i < nums.length - 1; i++) {
                if(nums[i] ==  nums[index]) {
                    if(tag == 0) {
                        tag = 1;
                    } else {
                        count++;
                    }
                }
            }

        }

    }
}
