class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    callBS(grid, i, j);
                } 
            }
        }
        return count;
        
    }
    public void callBS(char[][] grid, int i, int j) {
        if (i < 0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        callBS(grid, i+1, j); // up
        callBS(grid, i-1, j); //down
        callBS(grid, i, j-1); //left
        callBS(grid, i, j+1); //right
    }
}
