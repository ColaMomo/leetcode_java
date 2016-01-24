package com.kolamomo.leetcode;

/**
 * Unique Binary Search Trees
 *
 * <p>Given n, how many structurally unique BST's (binary search trees) that store values 1...n? <br>
 *
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 *
 *  1         3     3      2      1
 *  \       /     /      / \      \
 *  3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 *
 * @author jay
 */
public class Ex96 {

    public int numTrees(int n) {
        int count[] = new int[1000];
        count[0] = 1;
        for(int i = 1; i <= n; i++) {
            int num = 0;
            for(int j = 0; j <= i - 1; j++) {
                num = num + count[j] * count[i - 1 - j];
            }
            count[i] = num;
        }
        return count[n];
    }

    public static void main(String[] args) {
        Ex96 ex96 = new Ex96();
        System.out.println(ex96.numTrees(3));
    }
}
