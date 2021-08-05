public class InsertionSort{
  public static void sort(int[] array){
    int n = array.length;
    
    for(int i = 1; i < n; i++){
      int key = array[i]; 
      int j = i - 1; 
      while(j >= 0 && array[j] > key){
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp; 
        j--; 
      }
    }
  }
}

//Runtime o(n^2)
