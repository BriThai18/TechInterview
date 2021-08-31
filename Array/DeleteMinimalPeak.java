public class DeleteMinimalPeak{
  public static List<Integer> minimalPeaks(ArrayList<Integer> list){
    int n = list.size();
    List<Integer> result = new ArrayList<>();
    
    for(int i = 0; i < n; i++){
      int min = Integer.MAX_VALUE;
      int index = -1;
      int size = list.size();
      for(int j = 0; j < size; j++){
        if(j == 0 && j + 1 < size){
          if(list.get(j) > list.get(j+1) && min > list.get(j)){
            min = list.get(j);
            index = j; 
          }
        }else if(j == size - 1 && j - 1 >= 0){
          if(list.get(j) > list.get(j-1) && min > list.get(j)){
            min = list.get(j);
            index = j; 
          }
        }else if(size == 1){
          min = list.get(j);
          index = j; 
        }else if(list.get(j) > list.get(j-1) && list.get(j) > list.get(j+1)){
          min = list.get(j);
          index = j; 
        }
      }
      list.remove(index);
      result.add(min);
    }
    return result;
  }
}

//Runtime o(n^2)
//Space o(n)
