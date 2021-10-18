//package A;

import java.util.*;

class Merge_Sort {

    public static void main(String[] args) {

        int arr[] ={30,20,56,32,87,44};
        int lb = 0;
        int ub = arr.length - 1;

        mergesort(arr, lb, ub);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergesort(int[] arr, int lb, int ub) {

        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergesort(arr, lb, mid);
            mergesort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    private static void merge(int[] arr, int lb, int mid, int ub) {

        int ans[] = new int[arr.length];

        int i = lb;
        int j = mid + 1;
        int k = lb;

        while (i <= mid && j <= ub) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
                k++;
            } else {
                ans[k] = arr[j];
                j++;
                k++;
            }
        }


        if (i > mid) {
            while (j <= ub) {
                ans[k] = arr[j];
                j++;
                k++;
            }
        }
        if (j > ub) {
            while (i <= mid) {
                ans[k] = arr[i];
                i++;
                k++;
            }
        }
// ------------------------------- IMPORTANT --------
        for (int p = lb; p <= ub; p++) {
            arr[p] = ans[p];
        }
// ----------------------------------------------------
    }
}





