public class ConstructBinarySearchTreeFromPreorder{
  static class node{
    int data;
    node left, right;
    
    public node(int data){
      this.data = data; 
    }
  }
  public static node bstFromPreorder(int[] preorder){
    int id = 0;
    return helper(preorder, id, Integer.MAX_VALUE);
  }
  public static node helper(int[] preorder, int id, int limit){
    if(id > limit || id == preorder.length){
      return null; 
    }
    int value = preorder[id];
    node root = new node(value);
    root.left = helper(preorder, id+1, value);
    root.right = helper(preorder, id+1, limit);
    return root; 
  }
}
