public class LongestIncreasingPathInAMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        int[][] matrix =
                {
                        {1, 2, 3},
                        {6, 5, 4},
                        {7, 8, 9}
                };
        int i = longestIncreasingPath(matrix);
        System.out.println(i);
    }

    public static int longestIncreasingPath(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 1 && col == 1) {
            return 1;
        }

        int max = 0;
        int[][] memo = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (memo[i][j] == 0) {
                    max = Math.max(max, dfs(matrix, memo, i, j));
                }
            }
        }

        return max;
    }

    private static int dfs(int[][] matrix, int[][] memo, int x, int y) {
        if (memo[x][y] > 0) {
            return memo[x][y];
        }
        //                       up      down   left    right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int ans = 1;

        int row = matrix.length;
        int col = matrix[0].length;

        for (int[] direction : directions) {
            int nextX = x + direction[0];
            int nextY = y + direction[1];

            if (nextX < 0 || nextX >= row || nextY < 0 || nextY >= col) {
                continue;
            }

            if (matrix[nextX][nextY] <= matrix[x][y]) {
                continue;
            }

            ans = Math.max(ans, dfs(matrix, memo, nextX, nextY) + 1);
        }

        memo[x][y] = ans;
        return ans;
    }
}