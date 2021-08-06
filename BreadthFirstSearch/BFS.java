public class BFS{
  private int vertices;
  private LinkedList<Integer> adj[];
  
  BFS(int v){
    vertices = v; 
    adj = new LinkedList[v];
    for(int i = 0; i < v; i++){
      adj[i] = new LinkedList<>();
    }
  }
  void addEdge(int v, int w){
    adj[v].add(w); 
  }
  void breadthFirstSearch(int s){
    boolean visited[] = new boolean[vertices];
    LinkedList<Integer> queue = new LinkedList<>();
    
    visited[s] = true;
    queue.add(s);
    
    while(queue.size != 0){
      s = queue.poll(); 
      System.out.print(s + " ");
      
      Iterator<Integer> it = adj[s].listIterator();
      while(it.hasNext()){
        int n = it.next(); 
        if(!visited[n]){
          visited[n] = true; 
          queue.add(n); 
        }
      }
    }
  }
}

//Runtime o(v + e) 
//Space o(v)
