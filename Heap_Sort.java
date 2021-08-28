import java.util.*;
import java.text.DecimalFormat;
public class Main {
	
	public static void main(String [] args){
	
	int arr[] = {20,50,30,75,90,60,25,10,40};
	int n = arr.length;
	
	for(int i = n/2 - 1; i>=0; i--){
	    maxHeapify(arr,n,i);
	}
		System.out.println(Arrays.toString(arr));
	
	for(int i=n-1; i>=0; i--){
	    swap(arr,i,0);
	    maxHeapify(arr,i,0);
	}
	

}

public static void maxHeapify(int arr[],int n,int i){
    int largest = i;
    int left = 2 * i + 1;
    int right = 2*i + 2;
    
    while(left < n && arr[left] > arr[largest]){
        largest = left;
    }
    
    while(right < n && arr[right] >  arr[largest]){
        largest = right;
    }
    if(largest != i){
        swap(arr,largest,i);
        maxHeapify(arr,n,largest);
    }
}

public static void swap(int arr[],int l,int i){
    int temp  = arr[l];
    arr[l] = arr[i];
    arr[i] = temp;
}
}

