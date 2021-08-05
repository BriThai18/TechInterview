public class SortedArrayToBinarySearchTree{
  static class Node{
    int data;
    Node left, right;
    
    public Node(int data){
      this.data = data;
    }
  }
  Node sortedArrayToBST(int[] nums){
    if(nums.length == 0){
      return null; 
    }
    
    Node header = helper(nums, 0, nums.length - 1);
    return header; 
  }
  Node helper(int[] nums, int low, int high){
    if(low > high){
      return null; 
    }
    int mid = (high + low) / 2;
    Node root = new Node(nums[mid]);
    root.left = helper(nums, low, mid-1);
    root.right = helper(nums, mid+1, high);
    return root; 
  }
}
