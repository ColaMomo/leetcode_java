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
        int i = 0;
        int j = i + 1;
        int length = nums.length;
        while(j < length) {
            int tag = 0;
            while(j < length) {
                if(nums[i] ==  nums[j]) {
                    if(tag == 0) {
                        i++;
                        nums[i] = nums[j];
                        tag = 1;
                    }
                    j++;
                } else {
                    break;
                }
            }
            if(j < length) {
                i++;
                nums[i] = nums[j];
                j++;
            } else {
                break;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Ex80 ex80 = new Ex80();
        int[] nums = new int[]{1, 1,1 ,1,2,2,2,2,3};
        int n = ex80.removeDuplicates(nums);
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
