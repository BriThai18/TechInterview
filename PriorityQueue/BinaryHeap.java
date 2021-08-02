public class BinaryHeap{
  private int[] data;
  private int heapSize;
  
  public BinaryHeap(int size){
    data = new int[size];
    heapSize = 0; 
  }
  public int getMin(){
    if(isEmpty()){
      throw new HeapException("Heap is empty");
    }else{
      return data[0];
    }
  }
  public boolean isEmpty(){
    return heapSize == 0;
  }
  public void insert(int value){
    if(heapSize == data.length){
      throw new HeapException("Heap's underlying storage is overflow");
    }else{
      heapSize++;
      data[heapSize - 1] = value;
      siftUp(heapSize - 1);
    }
  }
  public removeMin(){
    if(isEmpty()){
      throw new HeapException("Heap is empty");
    }else{
      data[0] = data[heapSize - 1];
      heapSize--;
      if(heapSize > 0){
        siftDown(0);
      }
    }
  }
  public void print(){
    for(int i = 0; i < heapSize; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }
  private int getLefChildIndex(int nodeIndex){
    return 2 * nodeIndex + 1; 
  }
  private int getRightChildIndex(int nodeIndex){
    return 2 * nodeIndex + 2; 
  }
  private int getParentIndex(int nodeIndex){
    return (nodeIndex - 1) / 2; 
  }
  private void siftUp(int nodeIndex){
    int parentIndex, tmp;
    if(nodeIndex != 0){
      parentIndex = getParentIndex(nodeIndex);
      if(data[parentIndex] > data[nodeIndex]){
        tmp = data[parentIndex];
        data[parentIndex] = data[nodeIndex];
        data[nodeIndex] = tmp;
        siftUp(parentIndex);
      }
    }
  }
  private void siftDown(int nodeIndex){
    int leftChildIndex, rightChildIndex, minIndex, tmp;
    leftChildIndex = getLeftChildIndex(nodeIndex);
    rightChildIndex = getRightChildIndex(nodeIndex);
    if(rightChildIndex >= heapSize){
      if(leftChildIndex >= heapSize){
        return;
      }else{
        minIndex = leftChildIndex; 
      }
    }else{
      if(data[leftChildIndex] <= data[rightChildIndex]){
        minIndex = leftChildIndex;
      }else{
        minIndex = rightChildIndex; 
      }
    }
    if(data[nodeIndex] > data[minIndex]){
      tmp = data[minIndex];
      data[minIndex] = data[nodeIndex];
      data[nodeIndex] = tmp;
      siftDown(minIndex);
    }
  }
  public class HeapException extends RunTimeException{
    public HeapException(String message){
      super(message);
    }
  }
}
