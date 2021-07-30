public class InorderTraversal{
  static class Node{
    int data; 
    Node left, right;
   
    public Node(int data){
      this.data = data; 
    }
  }
  static Stack<Node> stack;
  static void inOrderTraversal(Node root){
    stack = new Stack<Node>();
    
    while(!stack.isEmpty() || root != null){
      while(root != null){
        stack.push(root);
        root = root.left; 
      }
      root = stack.pop();
      System.out.print(root.data + " ");
      root = root.right; 
    }
  }
}

//Runtime o(n)
