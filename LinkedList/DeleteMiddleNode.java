public class DeleteMiddleNode{
  static Node head;
  static class Node{
    int data;
    Node next;
    
    Node(int num){
      data = num;
      next = null; 
    }
  }
  static Node deleteMiddle(Node head){
    if(head == null){
      return null; 
    }
    if(head.next == null){
      return null; 
    }
    
    Node slow = head;
    Node fast = head;
    Node prev = null; 
    
    while(fast != null && fast.next != null){
      fast = fast.next.next;
      prev = slow; 
      slow = slow.next;
    }
    prev.next = slow.next;
    return head; 
  }
}

//Runtime o(n)
