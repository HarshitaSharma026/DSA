package Recurrsion.Backtracking;

import java.util.ArrayList;

public class AllDirections {
    public static void main(String[] args) {
//        boolean[][] arr = {{true, true, true},
//                {true, true, true},
//                {true, true, true}};
        boolean[][] arr = new boolean[3][3];
        System.out.println(allPathsMyWay(arr, "", 0,0));
//        obstacle1("", arr, 0,0 );
    }

    static void allPaths(boolean[][] maze, String proc, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(proc);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        // considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPaths(maze, proc + "D", r + 1, c );
        }

        if (c < maze[0].length - 1) {
            allPaths(maze, proc + "R", r, c + 1);
        }

        // left
        if (c > 0) {
            allPaths(maze, proc + "L", r, c - 1);
        }

        // up
        if (r > 0) {
            allPaths(maze, proc + "U", r - 1, c);
        }
        maze[r][c] = true;
    }

    static ArrayList<String > allPathsMyWay(boolean[][] maze, String proc, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
//            System.out.println(proc);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (maze[r][c]) {
            return ans;
        }
        // considering this block in my path
        maze[r][c] = true;

        if (r < maze.length - 1) {
            ans.addAll(allPathsMyWay(maze, proc + "D", r + 1, c ));
        }

        if (c < maze[0].length - 1) {
            ans.addAll(allPathsMyWay(maze, proc + "R", r, c + 1));
        }

        // left
        if (c > 0) {
            ans.addAll(allPathsMyWay(maze, proc + "L", r, c - 1));
        }

        // up
        if (r > 0) {
            ans.addAll(allPathsMyWay(maze, proc + "U", r - 1, c));
        }
        maze[r][c] = false;
        return ans;
    }

    // ---------------- printing the path number also
    static void allPaths(boolean[][] maze, String proc, int r, int c, int count) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(proc);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        // considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPaths(maze, proc + "D", r + 1, c );
        }

        if (c < maze[0].length - 1) {
            allPaths(maze, proc + "R", r, c + 1);
        }

        // left
        if (c > 0) {
            allPaths(maze, proc + "L", r, c - 1);
        }

        // up
        if (r > 0) {
            allPaths(maze, proc + "U", r - 1, c);
        }
        maze[r][c] = true;
    }

}
