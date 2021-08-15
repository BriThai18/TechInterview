public class ClimbingStairs{
  public static int climbStairs(int n){
    Map<Integer, Integer> memo = new HashMap<>();
    return helper(n, memo);
  }
  public static int helper(int n, Map<Integer, Integer> memo){
    if(memo.containsKey(n)){
      return memo.get(n); 
    }
    if(n == 0){
      return 1; 
    }
    if(n < 0){
      return 0; 
    }
    if(!memo.containsKey(n)){
      memo.put(n, helper(n-1, memo) + helper(n-2, memo));
    }
    return memo.get(n); 
  }
}
