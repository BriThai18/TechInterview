public class RemoveAdjacentDuplicate{
  public static String removeDuplicates(String s){
    Stack<Character> stack = new Stack<>();
    
    for(char x: s.toCharArray()){
      if(!stack.isEmpty() && x == stack.peek()){
        stack.pop();
      }else{
        stack.push(); 
      }
    }
    
    StringBuilder sb = new StringBuilder;
    for(char x: stack){
      sb.append(x); 
    }
    return sb.toString(); 
  }
}
