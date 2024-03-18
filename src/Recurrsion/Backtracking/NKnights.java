package Recurrsion.Backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, n);
    }

    static void knight(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        // if we are on last row and column is out of bound
        // skip it
        if (row == board.length - 1 && col == board.length) {
            return;
        }
        // if in one column we are not getting space to keep K
        // we can go on and keep it on next row
        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        // if it is not safe to keep knight there
        // then move forward
        knight(board, row, col + 1, knights);


    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col+1)) {
            if (board[row-2][col+1]) {
                return false;
            }
        }

        if (isValid(board, row-1, col-2)) {
            if (board[row-1][col-2]) {
                return false;
            }
        }

        if (isValid(board, row+1, col-2)) {
            if (board[row+1][col-2]) {
                return false;
            }
        }

        if (isValid(board, row+2, col-1)) {
            if (board[row+2][col-1]) {
                return false;
            }
        }

        if (isValid(board, row+2, col+1)) {
            if (board[row+2][col+1]) {
                return false;
            }
        }

        if (isValid(board, row+1, col+2)) {
            if (board[row+1][col+2]) {
                return false;
            }
        }

        if (isValid(board, row-1, col+2)) {
            if (board[row-1][col+2]) {
                return false;
            }
        }
        return true;
    }

    // to check if it is valid to keep the knights at that positions
    // like rows and columns are not getting out of bound
    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    static void display(boolean[][] board) {
        for (boolean[] row: board) {
            for (boolean elem: row) {
                if (elem) {
                    System.out.print("K" + " ");
                }
                else {
                    System.out.print("O"+ " ");
                }
            }
            System.out.println();
        }
    }
}
