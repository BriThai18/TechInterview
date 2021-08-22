public class ConstructBinaryTreeFromPreorderAndInorderTraversal{
  static class node{
    int data;
    node left, right;
    
    public node(int data){
      this.data = data; 
    }
  }
  public static node buildTree(int[] preorder, int[] inorder){
    if(inorder == null || preorder == null || inorder.length != preorder.length){
      return null; 
    }
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < inorder.length; i++){
      map.put(inorder[i], i);
    }
    return buildTree(inorder, 0, inorder.length-1, preorder, 0, preoder.length-1, map);
  }
  public static node buildTree(int[] preorder, int ps, int pe, int[] inorder, int is, int ie, Map<Integer, Integer> map){
    if(ps > pe || is > ie){
      return null; 
    }
    node root = new node(preorder[ps]);
    int r = map.get(root.data);
    int numsLeft = r - is;
    root.left = buildTree(preorder, ps+1, ps+numsLeft, inorder, is, r-1, map);
    root.right = buildTree(preorder, ps+numsLeft+1, pe, inorder, r+1, ie, map); 
    
    return root; 
  }
}

//Runtime o(n)
//Space o(n)
