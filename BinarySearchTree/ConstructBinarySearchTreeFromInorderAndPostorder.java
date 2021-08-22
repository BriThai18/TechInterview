public class ConstructBinarySearchTreeFromInorderAndPostorder{
  static class node{
    int data;
    node left, right;
    
    public node(int data){
      this.data = data; 
    }
  }
  public static node buildTree(int[] inorder, int[] preorder){
    if(inorder == null || preorder == null || inorder.length != preorder.length){
      return null; 
    }
    HashMap<Integer, Integer> map = new HashMap<>(); 
    for(int i = 0; i < inorder.length; i++){
      map.put(inorder[i], i);
    }
    return buildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
  }
  public static node buildTree(int[] inorder, int is, int ie, int[] postorder, int ps, int pe){
    if(ps > pe || is > ie){
      return null; 
    }
    node root = new node(postorder[pe]);
    int r = map.get(root.data);
    root.left = buildTree(inorder, is, r-1, postorder, ps, ps+r-is-1, map);
    root.right = buildTree(inorder, r+1, ie, postorder, ps+r-is, pe-1, map); 
    
    return root; 
  }
}
