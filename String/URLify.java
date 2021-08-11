public class URLify{
  public static String url(char[] str, int length){
    if(str == null){
      return "";
    }
    
    int space = 0; 
    int index = 0; 
    
    for(int i = 0; i < length; i++){
      if(str[i] == ' '){
        space++;
      }
    }
    
    index = length + space * 2 - 1; 
    
    for(int i = length - 1; i >= 0; i--){
      if(str[i] == ' '){
        str[index] = '0';
        str[index-1] = '2';
        str[index-2] = '%';
        index -= 3; 
      }else{
        str[index] = str[i];
        index--; 
      }
    }
    return new String(str).trim(); 
  }
}
