class Node{
  int data;
  Node left, right;
  
  Node(int data){
    this.data = data;
    left = right = null; 
  }
}
public class ValidateBST{
  Node root; 
  boolean isValidBST(Node node){
    if(node == null){
      return true;
    }
    return checkValid(node, null, null); 
  }
  boolean checkValid(Node node, Integer min, Integer max){
    if(node == null){
      return true; 
    }
    if(min != null && node.data <= min || max != null && node.data >= max){
      return false; 
    }
    return checkValid(node.left, min, node.data) && checkValid(node.right, node.data, max); 
  }
}

//Runtime o(n)
//Space o(n)
