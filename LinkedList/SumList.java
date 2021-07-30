public class SumList{
  static Node head;
  static Node head2;
  static class Node{
    int data;
    Node next;
    
    Node(int num){
      data = num;
      next = null; 
    }
  }
  static Node sumList(Node node, Node node2){
    int carry = 0; 
    Node cur, dummy = new Node(0);
    cur = dummy; 
    
    while(node != null || node2 != null || carry != 0){
      if(node != null){
        carry += node.data;
        node = node.next; 
      }
      if(node2 != null){
        carry += node2.data;
        node2 = node2.next; 
      }
      cur.next = new Node(carry % 10);
      carry /= 10;
      cur = cur.next; 
    }
    return dummy.next; 
  }
}
