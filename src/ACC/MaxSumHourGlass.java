package ACC;

public class MaxSumHourGlass {

    static int sumHourGlass(int[][] grid) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < grid.length- 1; i++) {
            for (int j = 1; j < grid[0].length - 1 ; j++) {
                sum += grid[i][j];
                sum += grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1];
                sum += grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1];
                if (sum > max)
                    max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] grid = {{1,2,3}, {4,5,6},{6,7,8}};
        System.out.println(sumHourGlass(grid));
    }
}
