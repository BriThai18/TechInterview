public class UniqueOccurrences{
  public static boolean uniqueOccurrences(int[] arr){
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int num : arr){
      map.put(a, 1 + map.getOrDefault(a, 0));
    }
    return map.size() == new HashSet<>(map.values()).size(); 
  }
}
