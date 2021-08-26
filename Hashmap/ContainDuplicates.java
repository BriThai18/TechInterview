public class ContainDuplicates{
  public static boolean containsDuplicate(int[] nums){
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int num : nums){
      map.put(num, 1 + map.getOrDefault(num, 0));
    }
    
    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
      if(entry.getValue() > 1){
        return true; 
      }
    }
    return false; 
  }
}
