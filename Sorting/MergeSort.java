public class MergeSort{
  public static void merge(int[] array, int left, int mid, int right){
    int size = mid - left + 1; 
    int size2 = right - mid; 
    
    int arr[] = new int[size];
    int arr2[] = new int[size2];
    
    for(int i = 0; i < size; i++){
      arr[i] = array[left + i]; 
    }
    for(int j = 0; j < size2; j++){
      arr2[j] = array[mid + 1 + j];
    }
    
    int i = 0; 
    int j = 0; 
    int k = left; 
    
    while(i < size && j < size2){
      if(arr[i] < arr2[j]){
        array[k] = arr[i];
        i++; 
      }else{
        array[k] = arr2[j];
        j++;
      }
      k++;
    }
    
    while(i < size){
      array[k] = arr[i];
      i++;
      k++;
    }
    while(j < size2){
      array[k] = arr2[j];
      j++;
      k++; 
    }
  }
  public static void sort(int[] array, int left, int right){
    if(left == right){
      return;
    }
    
    int mid = (left + right) / 2;
    sort(array, left, mid);
    sort(array, mid+1, right); 
    
    merge(array, left, mid, right); 
  }
}

//Runtime o(n log n)
