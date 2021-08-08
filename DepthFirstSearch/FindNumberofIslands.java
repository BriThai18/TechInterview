public class FindNumberofIslands{
  static int ROW = 5, COL = 5;
  
  boolean isSafe(int M[][], int row, int col, boolean visited[][]){
    return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][co] == 1 && !visited[row][col]);
  }
  void DFS(int M[][], int row, int col, boolean visited[][]){
    int[] rowNbr = {-1, 1, 0, 0};
    int[] colNbr = {0, 0, -1, 1};
    
    visited[row][col] = true;
    
    for(int i = 0; i < 4; i++){
      if(isSafe(grid, row + rowNbr[i], col + colNbr[i], visited)){
        DFS(grid, row + rowNbr[i], col + colNbr[i], visited);
      }
    }
  }
  int countIslands(int M[][]){
    boolean visited[][] = new boolean[ROW][COL];
    int count = 0; 
    
    for(int i = 0; i < ROW; i++){
      for(int j = 0; j < COL; j++){
        if(M[i][j] == 1 && !visited[i][j]){
          DFS(grid, i, j, visited);
          count++; 
        }
      }
    }
    return count; 
  }
}
