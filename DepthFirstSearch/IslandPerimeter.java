public class IslandPerimeter{
  public static int islandPerimeter(int[][] grid){
    if(grid == null){
      return 0; 
    }
    
    boolean visited[][] = new boolean[grid.length][grid[0].length];
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[0].length; j++){
        if(grid[i][j] == 1){
          return getPerimeter(grid, i, j, visited); 
        }
      }
    }
    return 0; 
  }
  public static int getPerimeter(int[][] grid, int row, int col, boolean visited[][]){
    if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length){
      return 1; 
    }
    if(grid[row][col] == 0){
      return 1; 
    }
    if(visited[row][col]){
      return 0; 
    }
    
    int count = 0; 
    visited[row][col] = true;
    
    count += getPerimeter(grid, row-1, col, visited) +
      getPerimeter(grid, row+1, col, visited) + 
      getPerimeter(grid, row, col-1, visited) + 
      getPerimeter(grid, row, col+1, visited); 
    
    return count; 
  }
}
