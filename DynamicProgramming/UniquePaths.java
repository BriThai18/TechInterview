public class UniquePaths{
  public static int uniquePaths(int m, int n, int[][] memo){
    if(memo[m][n] != 0){
      return memo[m][n];
    }
    if(m == 1 && n == 1){
      return 1;
    }
    if(m == 0 || n == 0){
      return 0; 
    }
    memo[m][n] = uniquePaths(m-1, n, memo) + uniquePaths(m, n-1, memo);
    return memo[m][n]; 
  }
  public static int setUp(int m, int n){
    int[][] memo = new int[m+1][n+1];
    return uniquePaths(m, n, memo);
  }
}
