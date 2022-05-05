import java.util.List;

public class Sort {

    public static int[] bubbleSort(int[] arr){
        int now;
        for (int i = 0; i < arr.length - 1; i++){
            try {
                if (arr[i] < arr[i + 1]) {
                    continue;
                }
                now = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = now;
                bubbleSort(arr);
            }catch(IndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        return arr;
    }

    public static int[] quickSort(int[] arr, int left, int right){
        if (left >= right){
            return arr;
        }
        int pivotPos = partition(arr, left, right);
        quickSort(arr, left, pivotPos - 1);
        quickSort(arr, pivotPos + 1, right);
        return arr;
    }
    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];

        int i = left;
        int j = right -1;
        while(i<j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (j > left && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int now = arr[i];
                arr[i] = arr[j];
                arr[j] = now;
                i++;
                j--;
            }
        }
        if (i == j && arr[i] < pivot){
            i++;
        }
        if (arr[i] != pivot){
            int now = arr[i];
            arr[i] = arr[right];
            arr[right] = now;
        }
        return i;
    }
}
