package com.kolamomo.leetcode;

import java.util.Arrays;

/**
 * Sort Colors
 *
 * <p>Given an array with n objects colored red, white or blue, <br>
 * sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.<br>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.<br>
 * Note:<br>
 * You are not suppose to use the library's sort function for this problem.<br>
 *
 *     @author jiangchao
 */
public class Ex75 {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while(i < j) {
            while(i < j && nums[i] != 2) {
                i++;
            }
            while(i < j && nums[j] == 2) {
                j--;
            }
            if(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }


        j = nums.length - 1;
        while(j >= 0 && nums[j] == 2) {
            j--;
        }
        i = 0;
        while(i < j) {
            while(i < j && nums[i] == 0) {
                i++;
            }
            while(i < j && nums[j] == 1) {
                j--;
            }
            if(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Ex75 ex75 = new Ex75();
        int[] arr = new int[]{1, 2, 0, 0, 1, 2,2, 0, 1,1 ,2, 0};
        ex75.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
