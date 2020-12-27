import java.util.Scanner;

public class Quick_Sort {
	
	public static void Quick(int a[], int lb,int ub) {
		int loc=0;
		if(lb < ub) {
			
			 loc = Partition(a,lb,ub);
			 Quick(a,lb,loc-1);
			 Quick(a,loc+1,ub);
		}
		
		
	}
	
	public static int Partition(int a[],int lb,int ub) {
	
		int pivot = a[lb];
		int start = lb;
		int end = ub;
		int temp = 0;
		
		while(start < end) {
			while(a[start] <= pivot && start != ub) {
				
				start++;
			}
			
			while(a[end] > pivot ) {
				end--;
			}
			if(start < end) {
				temp = a[start];
			   a[start] = a[end];
			   a[end] = temp;
			}
		}
		
		if(end < start && start < ub && end > lb) 
		temp = a[end];
		a[end] = a[lb];
		a[lb] = temp;
		return end ;
		
		
	
	
	
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number You Want to Insert:");
		int n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0; i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		Quick(a,0,n-1);
		
		for(int i : a) {
			System.out.println(i);
		}
	}
}
