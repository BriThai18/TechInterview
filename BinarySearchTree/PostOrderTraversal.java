public class PostOrderTraversal{
  static class Node{
    int data;
    Node left, right;
    
    public Node(int data){
      this.data = data; 
    }
    static Stack<Node> stack1, stack2;
    static void postOrderTraversal(Node root){
      stack1 = new Stack<Node>();
      stack2 = new Stack<Node>();
      
      if(root == null){
        return;
      }
      
      stack1.push(root);
      
      while(!stack1.isEmpty()){
        Node temp = stack1.pop();
        stack2.push(temp);
        
        if(temp.left != null){
          stack1.push(temp.left);
        }
        if(temp.right != null){
          stack1.push(temp.right);
        }
      }
      
      while(!stack2.isEmpty()){
        Node temp = stack2.pop();
        System.out.print(temp.data + " ");
      }
    }
  }
}

//Runtime o(n)
//Space o(n)
