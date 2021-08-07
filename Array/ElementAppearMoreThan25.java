public class ElementAppearMoreThan25{
  public static int findSpecialInteger(int[] arr){
    Map<Integer, Integer> map = new HashMap<>();
    int max = 0; 

    for(int num: arr){
      if(map.containsKey(num)){
        map.put(num, map.get(num) + 1);
      }else{
        map.put(num, 1); 
      }
    }
    
    for(Map.Entry<Integer, Integer> entry: map.entrySet()){
      float temp = entry.getValue() / (float) arr.length;
      if(temp >= 0.25){
        max = entry.getKey();
      }
    }
    return max; 
  } 
}
