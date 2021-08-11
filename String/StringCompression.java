public class StringCompression{
  public static int compress(char[] chars){
    if(chars == null || chars.length == 0){
      return 0; 
    }
    
    int index = 0, n = chars.length;
    int left = 0, right = 0;
    
    while(left < n){
      while(right < n && chars[left] == chars[right]){
        right++;
      }
      int count = right - left;
      chars[index++] = chars[left];
      if(count > 1){
        for(char c: String.valueOf(count).toCharArray()){
          chars[index++] = c; 
        }
      }
      left = right; 
    }
    return index; 
  }
}
