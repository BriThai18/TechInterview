public class UniquePaths{
  public static int uniquePaths(int m, int n, HashMap<String, Integer> memo){
    String key = m + "," + n;
    
    if(!memo.containsKey(key)){
      if(m == 1 || n == 1){
        memo.put(key, 1);
      }else{
        memo.put(key, uniquePaths(m-1, n, memo) + uniquePaths(m, n-1, memo));
      }
    }
    return memo.get(key); 
  }
}
