

public class QuickSort {
    public static int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) { // j=1 , i= 1

        if (arr[j] < pivot) {  //3 < 8 true
            i++;     // i=2
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }  //6 9 3 5 2 8
    }
    i++;
    int temp = arr[i];
    arr[i] = pivot;
    arr[high] = temp;
    return i;
}


    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pvtx = partition(arr, low, high);

            quicksort(arr, low, pvtx - 1);
            quicksort(arr, pvtx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = 6;

        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
