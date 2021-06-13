import kotlin.collections.unsigned.UArraysKt;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;

public class QuickSort {
    public static int partition(int array[], int low, int high){
        int pivot = array[high];

        int i = (low - 1);

        for(int j = low; j < high; j++){
            if(array[j] <= pivot){
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;

    }
    public static void sort(int array[], int low, int high){
        if(low < high){
            int pi = partition(array, low, high);

            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }
    public static void print(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] data = {8, 7, 2, 1, 0, 9, 6};

        sort(data, 0, data.length - 1);
        print(data);
    }
}

//Runtime o(n log n)
//Worst case o(n^2)
