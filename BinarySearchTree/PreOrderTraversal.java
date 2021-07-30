public class PreOrderTraversal{
  static class Node{
    int data; 
    Node left, right;
    
    public Node(int data){
      this.data = data; 
    }
  }
  static Stack<Node> stack; 
  static void preOrderTraversal(Node root){
    stack = new Stack<Node>();
    
    while(!stack.isEmpty() || root != null){
      while(root != null){
        System.out.print(root.data);
        stack.push(root);
        root = root.left; 
      }
      root = stack.pop();
      root = root.right; 
    }
  }
}
//Runtime o(n)
//Space o(n)
