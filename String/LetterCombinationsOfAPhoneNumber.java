public class LetterCombinationsOfAPhoneNumber{
  public static List<String> letterCombinations(String digits){
    String[] letters = {
      "",
      "",
      "abc",
      "def",
      "ghi",
      "jkl",
      "mno",
      "pqrs",
      "tuv",
      "wxyz",
    };
    List<String> result = new ArrayList<>(); 
    
    if(digits.length() == 0 || digits == null){
      return result; 
    }
    result.add("");
    
    for(int i = 0; i < digits.length(); i++){
      result = combine(letters[digits.charAt(i) - '0'], result);
    }
    return result; 
  }
  public static List<String> combine(String digit, List<String> l){
    List<String> result = new ArrayList<>(); 
    
    for(int i = 0; i < digit.length(); i++){
      for(String x : l){
        result.add(x + digit.charAt(i));
      }
    }
    return result; 
  }
}
