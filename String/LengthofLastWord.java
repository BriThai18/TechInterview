public class LengthofLastWord{
  public static int lengthLastWord(String s){
    int count = 0; 
    boolean check = false; 
    
    for(int i = s.length - 1; i >= 0; i--){
      if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
        check = true;
        count++; 
      }else if(check == true){
        return count; 
      }
    }
  }
}
