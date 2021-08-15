public class StringToInteger{
  public static int myAtoi(String s){
    if(s == null || s.isEmpty()){
      return 0; 
    }
    int sign = 1, index = 0, n = s.length();
   
    while(index < n && s.charAt(index) == ' '){
      index++; 
    } 
    if(index >= n){
      return 0; 
    }
    if(s.charAt(index) == '+' || s.charAt(index) == '-'){\
      sign = s.charAt(index) == '+' ? 1 : -1; 
    }
    long res = 0; 
    while(index < n && Character.isDigit(s.charAt(index))){
      res = res * 10 + (s.charAt(index++) - '0');
      if(res * sign > Integer.MAX_VALUE || res * sign < Integer.MIN_VALUE){
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE; 
      }
    }
    return (int) (res * sign); 
  }
}
