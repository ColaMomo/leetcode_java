package com.kolamomo.leetcode;

/**
 * Word Search
 *
 * <p>Given a 2D board and a word, find if the word exists in the grid.<br>
 * The word can be constructed from letters of sequentially adjacent cell, <br>
 * where "adjacent" cells are those horizontally or vertically neighboring. <br>
 * The same letter cell may not be used more than once.<br><br>
 *
 * For example,<br>
 * Given board =<br>
 * [<br>
 * ['A','B','C','E'],<br>
 * ['S','F','C','S'],<br>
 * ['A','D','E','E']<br>
 * ]<br>
 * word = "ABCCED", -> returns true,<br>
 * word = "SEE", -> returns true,<br>
 * word = "ABCB", -> returns false. <br>
 *
 *     @author jiangchao
 */
public class Ex79 {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        if(n == 0) {
            return false;
        }
        int m = board[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == word.charAt(0)) {
                    int[][] tag = new int[n][m];
                    boolean result = findWord(board, i, j, n, m, word, tag);
                    if(result) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean findWord(char[][] board, int i, int j, int n, int m, String word, int[][] tag) {
        if(word.length() == 1) {
            return board[i][j] == word.charAt(0);
        } else {
            tag[i][j] = 1;
            boolean result = false;
            if(i - 1 >= 0 && tag[i-1][j] == 0 && board[i-1][j] == word.charAt(1)) {
                result = findWord(board, i - 1, j, n, m, word.substring(1), tag);
            }
            if(!result && i + 1 < n && tag[i+1][j] == 0 && board[i+1][j] == word.charAt(1)) {
                result = findWord(board, i+1, j, n, m, word.substring(1), tag);
            }
            if(!result && j - 1 >= 0 && tag[i][j-1] == 0 && board[i][j-1] == word.charAt(1)) {
                result = findWord(board, i, j-1, n, m, word.substring(1), tag);
            }
            if(!result && j + 1 < m && tag[i][j+1] == 0 && board[i][j+1] == word.charAt(1)) {
                result = findWord(board, i, j+1, n, m, word.substring(1), tag);
            }
            if(!result) {
                tag[i][j] = 0;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Ex79 ex79 = new Ex79();
        System.out.println(ex79.exist(new char[][]{{'A', 'B', 'C', 'E'},{'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
        System.out.println(ex79.exist(new char[][]{{'A', 'B', 'C', 'E'},{'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE"));
        System.out.println(ex79.exist(new char[][]{{'A', 'B', 'C', 'E'},{'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCESEEEF"));
    }
}
