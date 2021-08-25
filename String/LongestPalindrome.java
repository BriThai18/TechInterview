public class LongestPalindrome{
  public static int longestPalindrome(String s){
    int[] char_counts = new int[128];
    int result = 0; 
    
    for(char c : s.toCharArray()){
      char_counts[c]++;
    }
    
    for(Integer num : char_counts){
      result += num / 2 * 2; 
      if(result % 2 == 0 && num % 2 == 1){
        result += 1; 
      }
    }
    return result; 
  }
}
