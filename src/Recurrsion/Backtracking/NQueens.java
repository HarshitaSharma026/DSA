package Recurrsion.Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(ways(board, 0));
    }

    static int ways(boolean[][] board, int row) {
        // base condition
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // check for places where we can place the queens
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                // after placing the queen, now we'll on to next row
                count += ways(board, row + 1);
                board[row][col] =false;         // when we'll come out of this function call, we need to make it false again.
            }
        }
        return count;
    }

    // ---------------------------- to check if we can place the queen at the given position
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertically
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // check for left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // check for right diagonal
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    // ----------------------------------------- to display the final answer
    private static void display(boolean[][] board) {
        for (boolean[] row: board) {
            for (boolean elem: row) {
                if (elem) {
                    System.out.print("Q" + " ");
                }
                else {
                    System.out.print("X" + " ");
                }
            }
            System.out.println();
        }
    }
}
