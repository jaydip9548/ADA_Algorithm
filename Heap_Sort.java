import java.util.*;
import java.text.DecimalFormat;

public class Heap_Sort {

    static int arr[] = {90, 80, 70, 60, 50, 40, 30, 20, 10};
    static int n = arr.length;

    //    Left Child : 2i + 1 && Right Child : 2i + 2;
    public static void main(String[] args) {

        int j = n - 1;
        for (int i = n / 2 - 1; n > 0; ) {
//        get the largest element at first pos
            heapSort(i, j);

//        swap that ele at end index j
            swap(0, j);
            j--;
//        updating n with without considering last swap element
            n = j + 1;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int i, int bound) {

        for (int j = i; j >= 0; j--) {
            int left = 2 * j + 1;
            int right = 2 * j + 2;
//            Left Child
            if (left <= bound && arr[j] < arr[left]) {
                swap(j, left);
            }
            if (right <= bound && arr[j] < arr[right]) {
                swap(j, right);
            }

        }


    }

    private static void swap(int j, int left) {

        int temp = arr[j];
        arr[j] = arr[left];
        arr[left] = temp;
    }
}

