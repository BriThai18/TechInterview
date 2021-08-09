public class Palindrome{
  static Node head;
  static class Node{
    int data;
    Node next;
    
    Node(int num){
      data = num;
      next = null; 
    }
  }
    static Node reverseList(Node node){
      Node prev = null;
      
      while(node != null){
        Node next = node.next;
        node.next = prev;
        prev = node;
        node = next;
      }
      return prev; 
    }
    static boolean isEqual(Node head){
      Node slow = head;
      Node fast = head;
      
      while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
      }
      
      slow = reverseList(slow);
      fast = head; 
      
      while(slow != null){
        if(slow.data != fast.data){
          return false; 
        }
        slow = slow.next;
        fast = fast.next; 
      }
      return true;
    }
}

//Runtime o(n)
