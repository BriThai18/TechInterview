public class SumOfUniqueElements{
  public static int sumOfUnique(int[] nums){
    Map<Integer, Integer> map = new HashMap<>();
    int sum = 0; 
    
    for(int num : nums){
      map.put(num, 1 + map.getOrDefault(num, 0));
    }
    
    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
      if(entry.getValue() == 1){
        sum += entry.getKey(); 
      }
    }
    return sum; 
  }
}
