public class DepthFirstSearch{
  private LinkedList<Integer> adjList[];
  private boolean visited[];
  private Stack<Integer> stack = new Stack<>();
  
  DepthFirstSearch(int vertices){
    adjList = new LinkedList[vertices];
    visited = new boolean[vertices];
    
    for(int i = 0; i < vertices; i++){
      adjList[i] = new LinkedList<Integer>(); 
    }
  }
  void addEdge(int src, int dest){
    adjList[src].add(dest);
  }
  void DFS(int vertex){
    visited[vertex] = true;
    System.out.print(vertex + " ");
    
    Iterator<Integer> it = adj[vertex].listIterator();
    while(it.hasNext()){
      int node = it.next();
      if(!visited[node]){
        DFS(node); 
      }
    }
  }
  boolean checkPath(int s, int d){
    visited[s] = true;
    stack.push(s);
    
    if(s == d){
      return true; 
    }
    
    Iterator<Integer> it = adj[s].listIterator();
    while(it.hasNext()){
      int node = it.next();
      if(!visited[node]){
        if(checkPath(node, d)){
          return true; 
        }
      }
    }
    stack.pop();
    return false; 
  }
}

//Runtime o(V + E)
