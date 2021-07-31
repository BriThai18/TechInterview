class Node{
  int data;
  Node left, right;
  
  Node(int data){
    this.data = data;
    left = right = null; 
  }
}
public class BalancedBinarySearchTree{
  Node root;
  boolean isBalanced(Node node){
    if(node == null){
      return true; 
    }
    return getHeight(node) != -1; 
  }
  int getHeight(Node node){
    if(node == null){
      return 0; 
    }
    int left = getHeight(node.left); 
    int right = getHeight(node.right);
    
    if(left == -1 || right == -1 || Math.abs(left - right) > 1){
      return -1; 
    }
    return Math.max(left, right) + 1; 
  }
}
