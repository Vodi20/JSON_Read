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
        int i = left-1;

        for(int j = left; j < right; j++){
            if(arr[j] < pivot){
                i++;
                int now = arr[j];
                arr[j] = arr[i];
                arr[i] = now;
            }
        }
        int now2 = arr[right];
        arr[right] = arr[i+1];
        arr[i+1] = now2;

        return i+1;
    }
}
