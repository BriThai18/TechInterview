public class SubsetSum{
  public static boolean subsetSum(int[] subset, int length, int sum, Map<String, Boolean> memo){
    if(sum == 0){
      return true; 
    }
    if(length < 0 || sum < 0){
      return 0; 
    }
    String key = length + "," + sum; 
    if(!memo.containsKey(key)){
      boolean include = subsetSum(subset, length-1, sum - subset[length], memo);
      boolean exclude = subsetSum(subset, length-1, sum);
      memo.put(key, include || exclude);
    }
    return memo.get(key); 
  }
}

//Runtime o(length * sum)
//Space o(length * sum)
