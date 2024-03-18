package Recurrsion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println(countPath(3, 3));
//        printPaths("", 3, 3);
//        System.out.println(pathList("", 3, 3));
//        System.out.println(pathListDiagonal("", 3, 3));
//        boolean[][] maze = {{true, true, false},
//                {true, true, true},
//                {false, true, true}};
//        obstacle("", maze, 0, 0);
        boolean[][] maze = new boolean[3][3];
        for (boolean[]  arr: maze) {
            System.out.println(Arrays.toString(arr));
        }

    }

    // counting the number of paths
    static int countPath(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        return countPath(r - 1, c) + countPath(r, c - 1);
    }

    // printing the paths
     static void printPaths(String proc, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(proc);
            return;
        }

        // means we can't go down now, because we are at the last row
         // we can only go right side
        if (r > 1) {
            printPaths(proc + "D", r - 1, c);
        }
        if (c > 1) {
            printPaths(proc + "R", r, c - 1);
        }
     }

     // print all the paths in an arraylist
    static ArrayList<String> pathList(String proc, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (r > 1) {
            ans = pathList(proc + "D", r - 1, c);
        }
        if (c > 1) {
            ans.addAll(pathList(proc + "R", r, c - 1));
        }
        return ans;
    }

    // print all the paths in an arraylist- in diagonal also
    static ArrayList<String> pathListDiagonal(String proc, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1 && c > 1) {
            ans = pathListDiagonal(proc + "di", r-1, c-1);
        }
        if (r > 1) {
            ans.addAll(pathListDiagonal(proc + "D", r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathListDiagonal(proc + "R", r, c - 1));
        }
        return ans;
    }


    // MAZE WITH OBSTACLE
    static void obstacle(String proc,boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(proc);
            return;
        }

        // if we are at the obstacle
        if (!maze[r][c]) {
            return;
        }
        // means we can't go down now, because we are at the last row
        // we can only go right side
        if (r < maze.length - 1) {
            obstacle(proc + "D",maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            obstacle(proc + "R", maze, r, c + 1);
        }
    }
}
