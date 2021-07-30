class Node{
  int data;
  Node left, right;
  
  Node(int data){
    this.data = data;
    left = right = null; 
  }
}
public class PathSum{
  Node root;
  boolean getPath(Node node, int target){
    if(node == null){
      return false; 
    }
    if(node.data == target && node.left == null && node.right == null){
      return true; 
    }
    return getPath(node.left, target-node.data) || getPath(node.right, target-node.data);
  }
}
