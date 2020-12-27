import java.util.*;
public class Heap_Sort {
	
	public static void Heap(int a[], int n){
		int temp;
		int b[] = new int[n];
		for(int i=n/2 - 1; i>=0;i--) {
			Heap1(a,i,n);
		}
	
		for(int i=n-1; i>=0;i--) {
			b[i] = a[0];
			a[0] = a[i];
			a[i]=0;
			Heap1(a,0,i);
		}
		
		System.out.println("Sorted Numbers are ");
		for(int i : b) {
		System.out.println(i);
	}
	
	}
	public static void Heap1(int a[],int j,int n)
	{  int temp=0;
		int largest = j;
		int left = 2*j + 1;
		int right = 2*j + 2;
		
		if(left < n && a[left] >a[largest]) {
			largest = left;
		}
		if(right < n && a[right] > a[largest]) {
			largest = right;
		}
		
		if(largest != j) {
			temp = a[j];
			a[j] = a[largest];
			a[largest] = temp;
			
			Heap1(a,largest,n);
		}
	}
public static void main(String[] args) {
long start = System.currentTimeMillis();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number You Want to Insert:");
	int n = sc.nextInt();
	int a[] = new int [n];
	for(int i=0; i<n;i++) {
		a[i] = sc.nextInt();
	}
	
	Heap(a,n);
	long end = System.currentTimeMillis();
	
	System.out.println("Total Time : "+(end-start)/1000 +" Second");
	
	
}
}
