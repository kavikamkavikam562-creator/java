class train52 {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            dfs(board, i, 0);
            dfs(board, i, m - 1);
        }

        for (int j = 0; j < m; j++) {
            dfs(board, 0, j);
            dfs(board, n - 1, j);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == '#')
                    board[i][j] = 'O';
            }
        }
    }

    void dfs(char[][] board, int r, int c) {
        if (r < 0 || r >= board.length ||
            c < 0 || c >= board[0].length ||
            board[r][c] != 'O')
            return;

        board[r][c] = '#';

        dfs(board, r + 1, c);
        dfs(board, r - 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
    }
}
