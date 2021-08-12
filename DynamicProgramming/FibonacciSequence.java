public class FibonacciSequence{
  public static int fib(int n){
    int[] memo = new int[n+2];
    
    memo[0] = 0;
    memo[1] = 1;
    
    for(int i = 2; i <= n; i++){
      memo[i] = memo[i-1] + memo[i-2];
    }
    
    return memo[n];
  }
}

//Runtime o(n)
//Space o(n)
