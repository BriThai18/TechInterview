public class MergeTwoSortedList{
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
  static Node merge(Node head, Node head2){
    if(head == null){
      return head2; 
    }
    if(head2 == null){
      return head; 
    }
    
    if(head.data < head2.data){
      head.next = merge(head.next, head2.data);
      return head;
    }else{
      head2.next = merge(head.data, head2.next);
      return head2; 
    }
  }
}

//Runtime o(m+n) where m and n are the length of the two list 
