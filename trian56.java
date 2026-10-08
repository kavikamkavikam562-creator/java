class train56 {
    public boolean canVisitAllRooms(int[][] rooms) {
        boolean[] visited = new boolean[rooms.length];
        dfs(0, rooms, visited);

        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    }

    void dfs(int room, int[][] rooms, boolean[] visited) {
        visited[room] = true;

        for (int key : rooms[room]) {
            if (!visited[key]) {
                dfs(key, rooms, visited);
            }
        }
    }
}