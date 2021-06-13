public class SelectionSort {
    public static void sort(int array[]){
        int minVal, minIndex = 0;
        int n = array.length;

        for(int i = 0; i < n; i++){
            minIndex = i;
            minVal = array[i];
            for(int j = i; j < n; j++){
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
    public static void print(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args){
        int array[] = {64, 25, 12, 22, 11};

        sort(array);
        print(array);
    }
}

//Runtime o(n^2)
