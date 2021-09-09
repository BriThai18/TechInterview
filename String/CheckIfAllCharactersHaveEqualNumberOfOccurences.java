public class CheckIfAllCharactersHaveEqualNumberOfOccurences{
  public static boolean areOccurencesEqual(String s){
    int[] freq = new int[26]; 
    
    for(char c : s.toCharArray()){
      freq[c - 'a']++;
    }
    
    int prev = freq[s.charAt(0) - 'a'];
    
    for(int num : freq){
      if(num != 0 && num != prev){
        return false; 
      }
    }
    return true; 
  }
}
