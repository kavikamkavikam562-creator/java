import java.util.*;

class train53 {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2)
                    q.add(new int[]{i, j});
                if (grid[i][j] == 1)
                    fresh++;
            }
        }

        int time = 0;
        int[][] d = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();

                for (int[] x : d) {
                    int r = cur[0] + x[0];
                    int c = cur[1] + x[1];

                    if (r >= 0 && r < grid.length &&
                        c >= 0 && c < grid[0].length &&
                        grid[r][c] == 1) {

                        grid[r][c] = 2;
                        fresh--;
                        q.add(new int[]{r, c});
                    }
                }
            }

            if (!q.isEmpty())
                time++;
        }

        return fresh == 0 ? time : -1;
    }
}
