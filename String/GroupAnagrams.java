public class GroupAnagrams{
  public static List<List<String>> groupAnagrams(String[] strs){
    Map<String, List<String>> map = new HashMap<>();
    
    for(String str : strs){
      char[] arr = str.toCharArray();
      Arrays.sort(arr);
      String key = new Strin(arr);
      if(!map.containsKey(key)){
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(str); 
    }
    return new ArrayList<>(map.values()); 
  }
}
