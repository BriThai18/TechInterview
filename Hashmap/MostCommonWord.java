public class MostCommonWord{
  public static String mostCommonWords(String s, String[] banned){
    Set<String> ban = new HashSet<>(Arrays.asList(banned));
    Map<String, Integer> map = new HashMap<>();
    int maxCount = 0; 
    
    String[] words = s.replaceAll("\\W+", " ").toLowerCase().split("\\s+");
    
    for(String word : words){
      if(!ban.contains(word)){
        int count = map.getOrDefault(w, 0) + 1;
        maxCount = Math.max(maxCount, count);
        map.put(w, count); 
      }
    }
    
    for(String key : map.KeySet()){
      if(map.get(key) == maxCount){
        return key; 
      }
    }
    return null; 
  }
}
