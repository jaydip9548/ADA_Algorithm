import java.util.Scanner;

public class Merge_Sort {

	public static void Devide(int a[],int first,int last) {
	
	
		int mid=0;
		
		if(first < last) {
			mid = (first + last) / 2;
			
			Devide(a,first,mid);
			Devide(a, mid+1,last);
			
			Merge(a,first,last,mid);
		}
		
	}
	
	public static void Merge(int a[],int first,int last,int mid) {
		int i = first;
	    int j = mid+1;
		int k = 0;    // i with 0, j with mid+1 and k = 0
		int b[] = new int[a.length];
		
		while(i <= mid && j  <= last) {
			if(a[i] < a[j]) {
				b[k] = a[i];
				i++;
			}
			else {
				b[k] = a[j];
				j++;
			}
			k++;
		}
		if(i > mid) {
			while(j <= last) {
				b[k] = a[j];
				j++;
			}
		}
		else {
			b[k] = a[i];
			i++;
		}
		
		for(int i1 : b) {
			System.out.println(i1);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number You Want to Insert:");
		int n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0; i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		Devide(a,0,n-1);
	}
}
