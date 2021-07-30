class Node{
  int data;
  Node left, right;
  
  Node(int data){
    this.data = data;
    left = right = null; 
  }
}
public class maxDepth{
  Node root; 
  int getMaxDepth(Node root){
    if(root == null){
      return 0; 
    }
    int left = getMaxDepth(root.left);
    int right = getMaxDepth(root.right);
    return Math.max(left, right) + 1; 
  }
}

//Runtime o(n)
