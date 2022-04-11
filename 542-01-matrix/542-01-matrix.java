class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 0) queue.add(new int[] {i, j});
            }
        }
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            for(int[] d: dir) {
                int x = curr[0] + d[0];
                int y = curr[1] + d[1];
                if(x >= 0 && x < mat.length && y >= 0 && y < mat[x].length && mat[x][y] != 0 && !visited[x][y]) {
                    mat[x][y] = mat[curr[0]][curr[1]] + 1;
                    visited[x][y] = true;
                    queue.add(new int[] {x, y});
                }
            }
        }
        return mat;
    }
}