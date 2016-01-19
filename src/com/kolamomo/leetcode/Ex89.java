package com.kolamomo.leetcode;

import com.kolamomo.leetcode.utils.ListUtils;

import java.util.*;

/**
 * Gray Code
 *
 * <p>The gray code is a binary numeral system where two successive values differ in only one bit.
 * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code.
 * A gray code sequence must begin with 0. <br>
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2 <br>
 * Note:
 * For a given n, a gray code sequence is not uniquely defined.
 * For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
 * For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
 *
 * @author jay
 */
public class Ex89 {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int[] arr = new int[(int)Math.pow(2, n)];
        arr[0] = 0;
        generateGrayCode(1, (int)Math.pow(2, n), arr, result);
        return result;
    }


    private void generateGrayCode(int base, int end, int[] arr, List<Integer> list) {
        if(base == end) {
            for(int i = 0; i < base; i++) {
                list.add(arr[i]);
            }
            return;
        }
        for(int i = 0; i < base; i++) {
            arr[base + i] = base + arr[base - 1 - i];
        }
        generateGrayCode(base * 2, end, arr, list);
    }


    /*
    public static Stack<Integer> stack = new Stack<Integer> ();
    public static Stack<Integer> stack2 = new Stack<Integer> ();
    public static Queue<Integer> queue = new LinkedList<Integer>();

    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        stack.push(0);
        generateGrayCode(1, (int)Math.pow(2, n), result);
        return result;
    }

    private void generateGrayCode(int base, int end, List<Integer> list) {
        if(base == end) {
            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }
        }

        while(!stack.isEmpty()) {
            Integer num = stack.pop();
            queue.add(num);
            stack2.add(num);
        }

        if(base == end) {
            return;
        }

        while(!queue.isEmpty()) {
            Integer num = queue.poll();
            stack.push(base + num);
        }
        while(!stack2.isEmpty()) {
            Integer num = stack2.pop();
            stack.push(num);
        }
        generateGrayCode(base * 2, end, list);
    }
*/
    public static void main(String args[]) {
        Ex89 ex89 = new Ex89();
        List<Integer> result = ex89.grayCode(0);
        ListUtils.printList(result);
    }
}
