public class Combination{
  public static List<List<Integer>> combine(int n, int k){
    List<List<Integer>> list = new ArrayList<>();
    combination(list, new ArrayList<>(), 1, n, k);
    return list; 
  }
  public static void combination(List<List<Integer>> list, List<Integer> temp, int start, int n, int k){
    if(k == 0){
      list.add(new ArrayList<>(temp));
      return; 
    }
    for(int i = start; i <= n; i++){
      temp.add(i);
      combination(list, temp, i+1, n, k-1);
      temp.remove(temp.size()-1); 
    }
  }
}

//Runtime o(n!/(n-k)!
