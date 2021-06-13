public class MergeSort {
    public static void merge(int array[], int left, int mid, int right){
        int size1 = mid - left + 1;
        int size2 = right - mid;

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        for(int i = 0; i < size1; i++){
            arr1[i] = array[left + i];
        }
        for(int j = 0; j < size2; j++){
            arr2[j] = array[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < size1 && j < size2){
            if(arr1[i] <= arr2[j]){
                array[k] = arr1[i];
                i++;
            }else{
                array[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < size1){
            array[k] = arr1[i];
            i++;
            k++;
        }

        while(j < size2){
            array[k] = arr2[j];
            j++;
            k++;
        }

    }
    public static void sort(int array[], int left, int right){
        if(left == right){
            return;
        }

        int mid = (left + right) / 2;
        sort(array, left, mid);
        sort(array, mid+1, right);

        merge(array, left, mid, right);
    }
    public static void print(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args){
        int array[] = {12, 11, 13, 5, 6, 7};

        sort(array, 0, array.length-1);
        print(array);
    }
}

//Runtime o(n log n)
