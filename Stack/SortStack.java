public class SortStack{
  public static Stack<Integer> SortStack(Stack<Integer> stack){
    if(stack == null || stack.isEmpty()){
      return; 
    }
    
    Stack<Integer> tempStack = new Stack<>(); 
    
    while(!stack.isEmpty()){
      int temp = stack.pop();
      while(!tempStack.isEmpty() && temp > tempStack.peek()){
        stack.push(tempStack.pop());
      }
      tempStack.push(temp); 
    }
    return tempStack; 
  }
}

//Runtime o(n^2)
