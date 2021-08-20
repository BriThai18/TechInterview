public class MaximumNumberOfRemovableCharacters{
  public static int maximumRemovals(String s, String p, int[] removable){
    char[] letters = s.toCharArray();
    int l = 0, r = removable.length;
    
    while(l <= r){
      int mid = (l+r)/2;
      for(int i = 0; i < mid; i++){
        letters[removable[i]] = '/';
      }
      if(check(letters, p)){
        l = mid+1; 
      }else{
        for(int i = 0; i < mid; i++){
          letters[removable[i]] = s.charAt(removable[i]);
          r = mid-1; 
        }
      }
    }
    return r; 
  }
  public static boolean check(char[] letters, String p){
    int i = 0, j = 0;
    while(i < letters.length && j < p.length()){
      char cur = letters[i], cur2 = p.charAt(j);
      if(cur != '/' && cur == cur2){
        j++; 
      }
      i++;
    }
    if(j == p.length()){
      return true; 
    }
    return false; 
  }
}
