class Solution { 
    class Pair{
        int row;
        int col;
        
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    
    
    public static int EMPTY = 0;
    public static int FRESH = 1;
    public static int ROTTEN = 2;
    public static int[][] directions = { {-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public int orangesRotting(int[][] grid) {
        LinkedList<Pair> queue = new LinkedList<>();
        
        int fresh = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==FRESH){
                    fresh++;
                }else if(grid[i][j]==ROTTEN){
                    queue.addLast(new Pair(i, j));
                }
            }
        }

        if(fresh==0){
            return 0;
        }
        
        int time = 0;
        while(queue.size() > 0){
            LinkedList<Pair> next = new LinkedList<>();
            
            while(queue.size() > 0){
                Pair rp = queue.removeFirst();
                
                for(int[] dir : directions){
                    int x = rp.row + dir[0];
                    int y = rp.col + dir[1];
                    
                    if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length){
                        if(grid[x][y]==FRESH){
                            grid[x][y] = ROTTEN;
                            next.addLast(new Pair(x, y));
                            --fresh;
                        }
                    }
                }
            }
            queue = next;
            ++time;
        }
        
        return fresh > 0 ? -1 : time - 1;
    }
}