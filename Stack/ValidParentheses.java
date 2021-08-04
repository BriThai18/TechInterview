public class ValidParentheses{
  public static boolean isValid(String s){
    Stack<Character> stack = new Stack<>();
    char x; 
    
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
        stack.push(s.charAt(i));
        continue; 
      }
      if(stack.isEmpty()){
        return false; 
      }
      
      switch(s.charAt(i)){
        case ')':
          x = stack.peek();
          stack.pop(); 
          if(x == '[' || x == '{'){
            return false; 
          }
          break;
        case ']':
          x = stack.peek();
          stack.pop();
          if(x == '{' || x == '('){
            return false; 
          }
          break; 
        case '}':
          x = stack.peek();
          stack.pop(); 
          if(x == '[' || x ==  '('){
            return false; 
          }
      }
    }
    return stack.isEmpty(); 
  }
}
