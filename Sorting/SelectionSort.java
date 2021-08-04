public class SelectionSort{
  public static void sort(int[] array){
    int minVal, minIndex = 0; 
    int n = array.length;
    
    for(int i = 0; i < n; i++){
      minIndex = i;
      minVal = array[i];
      for(int j = 1; j < n; j++){
        if(array[j] < minVal){
          minVal = array[j];
          minIndex = j; 
        }
      }
      if(minVal < array[i]){
        int temp = array[i]; 
        array[i] = array[minIndex];
        array[minIndex] = temp; 
      }
    }
  }
}

//Runtime o(n^2)
