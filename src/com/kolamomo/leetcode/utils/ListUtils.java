package com.kolamomo.leetcode.utils;

import java.util.List;

/**
 * Created by jay on 16-1-13.
 */
public class ListUtils {
    public static<T> void printList(List<T> list) {
        for(T t : list) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static<T> void printNestList(List<List<T>> list) {
        for(List<T> tList : list) {
            for (T t : tList) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }

}
