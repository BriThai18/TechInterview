public class Partition2{
  static Node head; 
  static class Node{
    int data;
    Node next;
    
    Node(int num){
      data = num;
      next = null; 
    }
  }
  static Node partition(Node head, int x){
    Node beforeStart = null;
    Node beforeEnd = null;
    Node afterStart = null;
    Node afterEnd = null;
    
    while(head != null){
      Node next = head.next;
      head.next = null; 
      if(head.data < x){
        if(beforeStart == null){
          beforeStart = head;
          beforeEnd = beforeStart; 
        }else{
          beforeEnd.next = head;
          beforeEnd = head; 
        }
      }else{
        if(afterStart == null){
          afterStart = head;
          afterEnd = afterStart; 
        }else{
          afterEnd.next = head;
          afterEnd = head; 
        }
      }
    }
    
    if(beforeStart == null){
      return afterStart;
    }
    
    beforeEnd.next = afterStart;
    return beforeStart; 
  }
}
