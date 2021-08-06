public class Subsets{
  public static List<List<Integer>> subsets(int[] nums){
    List<List<Integer>> res = new ArrayList<>();
    res.add(new ArrayList<>());

    for(int num: nums){
      List<List<Integer>> temp = new ArrayList<>();
      for(List<Integer> in : res){
        List<Integer> a = new ArrayList<>(in);
        a.add(num);
        temp.add(a);
      }
      res.addAll(temp);
    }
    return res; 
  }
}
