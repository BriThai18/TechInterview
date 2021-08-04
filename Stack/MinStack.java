public class MinStack{
  Stack<Integer> stack = new Stack<>();
  Stack<Integer> min = new Stack<>();
  
  public void push(int x){
    if(min.isEmpty() || x <= min.peek()){
      min.push(x);
    }
    stack.push(x);
  }
  public void pop(){
    stack.pop();
    min.pop(); 
  }
  public int top(){
    return stack.peek();
  }
  public int min(){
    return min.peek(); 
  }
}
