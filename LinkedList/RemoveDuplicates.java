class RemoveDuplicates{
  static Node head;
  static class Node{
    int data;
    Node next;
    
    Node(int num){
      data = num;
      next = null; 
    }
  }
  void removeDuplicates(){
    Node current = head;
    
    while(current != null){
      Node runner = current;
      while(runner.next != null){
        if(runner.next.data == current.data){
          runner.next = runner.next.next; 
        }else{
          runner = runner.next; 
        }
      }
      current = current.next; 
    }
  }
}

//Runtime o(n^2)
