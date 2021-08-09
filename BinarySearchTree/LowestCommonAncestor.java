class Node{
  int data;
  Node left, right;
  
  Node(int data){
    this.data = data;
    left = right = null; 
  }
}
public class LowestCommonAncestor{
  Node root;
  Node lowestCommonAncestor(Node node, int node1, int node2){
    if(node == null || node.data == node1 || node.data == node2){
      return node; 
    }
    
    Node left = lowestCommonAncestor(node.left, node1, node2);
    Node right = lowestCommonAncestor(node.right, node1, node2);
    
    if(left != null && right != null){
      return node; 
    }
    
    return left != null ? left : right; 
  }
}
