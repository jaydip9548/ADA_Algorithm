package A;

import java.util.*;
class class1{
    static int ans[] = new int[5];
    public static void main (String[] args) {
        int arr[] = {10,34,76,23,90};
        int n = arr.length;

        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(ans));
    }

    public static void mergeSort(int arr[],int l,int r){
        if(l < r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r,ans);
        }
    }

    public static void merge(int arr[],int l,int mid,int r,int ans[]){
        int i = l;
        int j = mid+1;
        int k=0;

        while(i <= mid && j <= r){
            if(arr[i] <= arr[j]){
                ans[k] =arr[i];
                i++;
            }else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        if(i > mid){
            while(j <= r){
                ans[k] = arr[j];
                j++;
                k++;
            }
        }else{
            while(i <= mid){
                ans[k] = arr[i];
                k++;
                i++;
            }
        }
    }

}





