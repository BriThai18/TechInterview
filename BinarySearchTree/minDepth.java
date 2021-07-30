class Node{
  int data;
  Node left, right;
  
  Node(int data){
    this.data = data;
    left = right = null; 
  }
}
public class minDepth{
  Node root;
  int getMinDepth(Node root){
    if(root == null){
      return 0; 
    }
    int left = getMinDepth(node.left);
    int right = getMinDepth(node.right);
    return Math.min(left, right) + 1; 
  }
}

//Runtime o(n)
