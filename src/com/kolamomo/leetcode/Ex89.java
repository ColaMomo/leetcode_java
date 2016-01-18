package com.kolamomo.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by jay on 16-1-13.
 */
public class Ex89 {
    public static Stack<Integer> stack = new Stack<Integer> ();
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        boolean[] tagArr = new boolean[n];
        char[] binaryArr = new char[n];
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                result.add();
                binaryArr[j] = (char)('1' - binaryArr[j] + '0');
            }

        }
    }

    private void generateGrayCode(int index, int n, List<Integer> list) {
        while(!stack.isEmpty()) {
            Integer num = stack.pop();
        }

    }
}
