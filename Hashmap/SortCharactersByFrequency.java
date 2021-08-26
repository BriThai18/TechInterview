public class SortCharactersByFrequency{
  public static String frequencySort(String s){
    Map<Character, Integer> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    
    for(char c : s.toCharArray()){
      if(map.containsKey(c)){
        map.put(c, map.get(c) + 1); 
      }else{
        map.put(c, 1); 
      }
    }
    
    ArrayList<Integer> list = new ArrayList<>(map.values());
    Collections.sort(list, Collections.reverseOrder()); 
    
    for(int num : list){
      for(Map.Entry<Character, Integer> entry : map.entrySet()){
        if(num == entry.getValue()){
          while(entry.getValue != 0){
            sb.append(entry.getKey());
            map.put(entry.getKey(), entry.getValue() - 1); 
          }
        }
      }
    }
    return sb.toString(); 
  }
}
